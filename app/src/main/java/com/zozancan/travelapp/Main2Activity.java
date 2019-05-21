package com.zozancan.travelapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.zozancan.travelapp.firstfragment.FirstFragment;

public class Main2Activity extends AppCompatActivity {

    public static final String FRAGMENT_VIEWPAGER = "FRAGMENT_VIEWPAGER";
    public static final String FRAGMENT_FIRST = "FRAGMENT_FIRST";
    public static final String FRAGMENT_SECOND = "FRAGMENT_SECOND";
    public static final String FRAGMENT_THIRD = "FRAGMENT THIRD";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    replaceFragment(FirstFragment.newInstance(), FRAGMENT_FIRST);
                    return true;
                case R.id.navigation_tours:
                    replaceFragment(SecondFragment.newInstance(), FRAGMENT_SECOND);
                    return true;
                case R.id.navigation_explore:
                    replaceFragment(ThirdFragment.newInstance(), FRAGMENT_THIRD);
                    return true;
                case R.id.navigation_profile:
                    replaceFragment(ViewPagerFragment.newInstance(), FRAGMENT_VIEWPAGER);
                    return true;

            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_container, FirstFragment.newInstance(), FRAGMENT_FIRST)
                .commit();
    }

    private void replaceFragment(Fragment newFragment, String tag) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, newFragment, tag)
                .commit();

    }

}

