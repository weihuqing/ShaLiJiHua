package com.example.shalijihua;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class MainActivity extends FragmentActivity implements OnClickListener
{
    
    private ViewPager mViewPager;
    
    private FragmentPagerAdapter mAdapter;
    
    private List<Fragment> mFragments = new ArrayList<Fragment>();
    
    private RelativeLayout mTabBtn1;
    
    private RelativeLayout mTabBtn2;
    
    private RelativeLayout mTabBtn3;
    
    private RelativeLayout mTabBtn4;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main_layout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        
        mTabBtn1 = (RelativeLayout) findViewById(R.id.tab1);
        mTabBtn2 = (RelativeLayout) findViewById(R.id.tab2);
        mTabBtn3 = (RelativeLayout) findViewById(R.id.tab3);
        mTabBtn4 = (RelativeLayout) findViewById(R.id.tab4);
        
        mTabBtn1.setOnClickListener(this);
        mTabBtn2.setOnClickListener(this);
        mTabBtn3.setOnClickListener(this);
        mTabBtn4.setOnClickListener(this);
        
        FragmentZonglan zonglan = new FragmentZonglan();
        FragmentJiLu jiLu = new FragmentJiLu();
        FragmentShuJu shuJu = new FragmentShuJu();
        FragmentAnQuan anQuan = new FragmentAnQuan();
        
        mFragments.add(zonglan);
        mFragments.add(jiLu);
        mFragments.add(shuJu);
        mFragments.add(anQuan);
        
        mAdapter = new ShaLiAdaper(getSupportFragmentManager());
        
        mViewPager.setAdapter(mAdapter);
        
        mViewPager.setOnPageChangeListener(new ShaLiPageChangeListener());
    }
    
    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        if (mTabBtn1 == v)
        {
            mViewPager.setCurrentItem(0, true);
        }
        
        if (mTabBtn2 == v)
        {
            mViewPager.setCurrentItem(1, true);
        }
        
        if (mTabBtn3 == v)
        {
            mViewPager.setCurrentItem(2, true);
        }
        
        if (mTabBtn4 == v)
        {
            mViewPager.setCurrentItem(3, true);
        }
        
    }
    
    private class ShaLiAdaper extends FragmentPagerAdapter
    {
        
        public ShaLiAdaper(FragmentManager fm)
        {
            super(fm);
            // TODO Auto-generated constructor stub
        }
        
        @Override
        public Fragment getItem(int arg0)
        {
            // TODO Auto-generated method stub
            return mFragments.get(arg0);
        }
        
        @Override
        public int getCount()
        {
            // TODO Auto-generated method stub
            return mFragments.size();
        }
        
    }
    
    private class ShaLiPageChangeListener implements OnPageChangeListener
    {
        
        @Override
        public void onPageScrollStateChanged(int arg0)
        {
            // TODO Auto-generated method stub
            
        }
        
        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2)
        {
            // TODO Auto-generated method stub
            
        }
        
        @Override
        public void onPageSelected(int arg0)
        {
            // TODO Auto-generated method stub
            
        }
        
    }
}
