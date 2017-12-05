package com.ravi.fragment.java;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ravi.fragment.R;

/**
 * Created by SATYANARAYANA on 2/4/2017.
 */

public class Fragment2 extends Fragment{

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View  v= inflater.inflate(R.layout.dynamicfragment1,container,false);
        TextView tv=(TextView)v.findViewById(R.id.textView2);
        tv.setText("ravi");

            return v;


        }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}