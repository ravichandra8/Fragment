package com.ravi.fragment.java;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ravi.fragment.R;

/**
 * Created by SATYANARAYANA on 2/4/2017.
 */

public class Fragment1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dynamicfragment1,container,false);


    }
}
