package com.example.shalijihua;

import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class MainActivity extends FragmentActivity
{
    
    private ViewPager mViewPager;
    
    private FragmentPagerAdapter mAdapter;
    
    private List<Fragment> mFragments;
    
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
        
        mTabBtn1.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                mViewPager.setCurrentItem(0, true);
            }
        });
        
        FragmentZonglan zonglan = new FragmentZonglan();
        mFragments.add(zonglan);
        
        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager())
        {
            
            @Override
            public int getCount()
            {
                // TODO Auto-generated method stub
                return mFragments.size();
            }
            
            @Override
            public Fragment getItem(int arg0)
            {
                // TODO Auto-generated method stub
                return mFragments.get(arg0);
            }
        };
        
        mViewPager.setAdapter(mAdapter);
        
        mViewPager.setOnPageChangeListener(new OnPageChangeListener()
        {
            
            @Override
            public void onPageSelected(int arg0)
            {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2)
            {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onPageScrollStateChanged(int arg0)
            {
                // TODO Auto-generated method stub
                
            }
        });
    }
}
