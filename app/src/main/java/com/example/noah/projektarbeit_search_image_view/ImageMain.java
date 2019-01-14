package com.example.noah.projektarbeit_search_image_view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ImageMain extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stadt_daten);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        if(params != null)
        {
            String city = params.getString("city");
        }

        ViewPager vp = findViewById(R.id.imgview);
        ImageAdapter adapterView = new ImageAdapter(this);
        vp.setAdapter(adapterView);
    }
}
