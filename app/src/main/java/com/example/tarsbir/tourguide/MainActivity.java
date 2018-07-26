package com.example.tarsbir.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar_id);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new CityFragment(),getString(R.string.city));
        adapter.AddFragment(new PlacesFragment(),getString(R.string.places));
        adapter.AddFragment(new SightsFragment(), getString(R.string.sight));
        adapter.AddFragment(new HotelsFragment(),getString(R.string.hotel));
        adapter.AddFragment(new MallFragment(),"Mall");
        //adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setSupportActionBar(toolbar);

    }

}
