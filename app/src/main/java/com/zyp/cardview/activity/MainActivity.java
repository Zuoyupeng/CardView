package com.zyp.cardview.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zyp.cardview.R;
import com.zyp.cardview.fragment.FirstFragment;
import com.zyp.cardview.fragment.NewsFragment;
import com.zyp.cardview.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    NewsFragment newsFragment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        newsFragment = new NewsFragment();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initPagerContent(newsFragment);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initPagerContent(firstFragment);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initPagerContent(secondFragment);
            }
        });
        //替换
        initPagerContent(newsFragment);
    }

    private void initPagerContent(Fragment fragment) {
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        //会话
        android.support.v4.app.FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.fm, fragment);
        ft.commit();
    }
}
