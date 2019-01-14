package com.example.noah.projektarbeit_search_image_view;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ImageMain extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stadt_daten);

        ViewPager vp = findViewById(R.id.imgview);
        ImageAdapter adapterView = new ImageAdapter(this);
        vp.setAdapter(adapterView);
    }
}
