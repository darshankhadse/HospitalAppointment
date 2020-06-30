package com.comkct.hospitalappointment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class DetailTab extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tab);


        tabLayout = (TabLayout) findViewById(R.id.);
        appBarLayout = (AppBarLayout) findViewById(R.id.);
        viewPager = (ViewPager) findViewById(R.id.);
    }
}
