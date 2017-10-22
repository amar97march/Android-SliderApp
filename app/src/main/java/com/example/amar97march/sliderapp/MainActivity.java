package com.example.amar97march.sliderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencing to our images
        images=new int[] {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6};

        (viewPager)=(ViewPager)findViewById(R.id.pager);
        //get reference to the ViewPager in the Layout
        adapter= new ImagePagerAdapter(MainActivity.this,images);
        //Bind PageAdapter to the ViewPager
        viewPager.setAdapter(adapter);
    }
}