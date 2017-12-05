package com.ravi.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ravi.fragment.xml.ActivityPage;

public class MainActivity extends AppCompatActivity {


    int count=0;
    TextView tv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button xml=(Button)findViewById(R.id.xml);
        Button java=(Button)findViewById(R.id.button);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,com.ravi.fragment.java.ActivityPage.class);
                startActivity(i);
            }
        });
        xml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, ActivityPage.class);
                startActivity(i);
            }
        });

        Button save=(Button)findViewById(R.id.save);
        tv=(TextView)findViewById(R.id.count);
        if(savedInstanceState==null)
        {
            tv.setText(count+"");
        }
        else
        {
            tv.setText(savedInstanceState.getInt("data")+"");
        }
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tv.setText(count+"");
            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("data",count);
    }
}
