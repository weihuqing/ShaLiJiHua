package com.example.shalijihua;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentAnQuan extends Fragment
{
    private View mView;
    
    private TextView mTitleText;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        mView =
            inflater.inflate(R.layout.fragment_anquanzhongxin, container, false);
        mTitleText = (TextView) mView.findViewById(R.id.fragment_title);
        mTitleText.setText(R.string.tab_anquanzhongxin);
        return mView;
    }
}
