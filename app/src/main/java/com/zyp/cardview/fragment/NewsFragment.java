package com.zyp.cardview.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zyp.cardview.R;
import com.zyp.cardview.adapter.ContentFragmentAdapter;
import com.zyp.cardview.transformer.VerticalStackTransformer;
import com.zyp.cardview.view.OrientedViewPager;
import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends android.support.v4.app.Fragment {

    private OrientedViewPager mOrientedViewPager;
    private ContentFragmentAdapter mContentFragmentAdapter;
    private List<Fragment> mFragments;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view == null) {
            view = inflater.inflate(R.layout.fragment_music, null);
        }
        if(mFragments == null ||mFragments.size() == 0) {
            findView(view);
        }
        return view;
    }

    /**
     * 初始化view
     */
    private void findView(View view) {
        String[] str = {"0","1","2","3","4","5","6","7","8","9"};
        mOrientedViewPager = (OrientedViewPager) view.findViewById(R.id.view_pager);
        mFragments = new ArrayList<>();
        //假数据
        for (int i = 0; i < str.length; i++) {
            mFragments.add(CardFragment.newInstance(i));
        }
        mContentFragmentAdapter = new ContentFragmentAdapter(getFragmentManager(),mFragments);
        //设置viewpager的方向为竖直
        mOrientedViewPager.setOrientation(OrientedViewPager.Orientation.VERTICAL);
        //设置limit
        mOrientedViewPager.setOffscreenPageLimit(4);
        //设置transformer
        mOrientedViewPager.setPageTransformer(true, new VerticalStackTransformer(getActivity()));
        mOrientedViewPager.setAdapter(mContentFragmentAdapter);

    }

}
