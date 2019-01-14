package com.example.noah.projektarbeit_search_image_view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter
{
    Context mainActivity_Context;
    private int[] sliderImageID = new int[]{R.drawable.wien2, R.drawable.wien};

    public ImageAdapter(Context context) {
        this.mainActivity_Context = context;
    }

    @Override
    public int getCount() {
        return sliderImageID.length;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((ImageView) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == ((ImageView) o);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mainActivity_Context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(sliderImageID[position]);
        ((ViewPager)container).addView(imageView, 0);
        return imageView;
    }
}
