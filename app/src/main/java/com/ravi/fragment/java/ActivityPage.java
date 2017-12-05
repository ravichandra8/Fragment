package com.ravi.fragment.java;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ravi.fragment.R;

/**
 * Created by SATYANARAYANA on 2/4/2017.
 */

public class ActivityPage extends Activity {
    FragmentTransaction transaction;
     TextView tv;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.javaactivity);
        Button b1=(Button)findViewById(R.id.b1);
        Button b2=(Button)findViewById(R.id.b2);
        tv=(TextView)findViewById(R.id.tv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(getFragmentManager().getBackStackEntryCount()+"");
                Fragment1 f=new Fragment1();
                transaction= getFragmentManager().beginTransaction();
                transaction.add(R.id.frag,f,"frag");
                transaction.addToBackStack(null);
                transaction.commit();

                tv.setText(getFragmentManager().getBackStackEntryCount()+"");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(getFragmentManager().getBackStackEntryCount()+"");
                Fragment2 f1=new Fragment2();
                transaction= getFragmentManager().beginTransaction();
                transaction.replace(R.id.frag,f1,"frag1");
                transaction.addToBackStack(null);
                transaction.commit();
                tv.setText(getFragmentManager().getBackStackEntryCount()+"");
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        tv.setText(getFragmentManager().getBackStackEntryCount()+"");
    }
}
