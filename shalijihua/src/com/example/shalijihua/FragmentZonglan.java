package com.example.shalijihua;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shalijihua.R;

public class FragmentZonglan extends Fragment
{
    private TextView mTitleText;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        
        return view;
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        
        mTitleText = (TextView) getView().findViewById(R.id.fragment_title);
        mTitleText.setText(R.string.tab_zonglan);
    }
}
