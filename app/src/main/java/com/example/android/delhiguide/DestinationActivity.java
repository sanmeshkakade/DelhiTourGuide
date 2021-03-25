package com.example.android.delhiguide;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class DestinationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.destination_activity);

        ViewPager viewPager = (ViewPager)findViewById(R.id.explore_delhi_view_pager);

        DestinationFragmentPageAdapter pageAdapter = new DestinationFragmentPageAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.explore_delhi_tabs);

        tabLayout.setupWithViewPager(viewPager);

    }
}
