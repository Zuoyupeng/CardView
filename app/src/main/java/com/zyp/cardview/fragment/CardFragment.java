package com.zyp.cardview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.zyp.cardview.R;

public class CardFragment extends Fragment implements View.OnClickListener {

    private static final String INDEX_KEY = "index_key";

    public static CardFragment newInstance(int index) {
        CardFragment fragment = new CardFragment();
        Bundle bdl = new Bundle();
        bdl.putInt(INDEX_KEY, index);
        fragment.setArguments(bdl);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_card, container, false);
        ImageButton ib1 = (ImageButton) v.findViewById(R.id.ib1);
        ImageButton ib2 = (ImageButton) v.findViewById(R.id.ib2);
        ImageButton ib3 = (ImageButton) v.findViewById(R.id.ib3);
        ImageButton ib4 = (ImageButton) v.findViewById(R.id.ib4);
        ImageButton ib5 = (ImageButton) v.findViewById(R.id.ib5);
        ImageButton ib6 = (ImageButton) v.findViewById(R.id.ib6);
        ImageButton ib7 = (ImageButton) v.findViewById(R.id.ib7);
        ImageButton ib8 = (ImageButton) v.findViewById(R.id.ib8);
        //ImageButton ib9 = (ImageButton) v.findViewById(R.id.ib9);
        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
        ib3.setOnClickListener(this);
        ib4.setOnClickListener(this);
        ib5.setOnClickListener(this);
        ib6.setOnClickListener(this);
        ib7.setOnClickListener(this);
        ib8.setOnClickListener(this);
        //ib9.setOnClickListener(this);
        TextView cardNumTv = (TextView) v.findViewById(R.id.card_num_tv);
        final Bundle bundle = getArguments();
        if (bundle != null) {
            cardNumTv.setText(bundle.getInt(INDEX_KEY, 0) + "");
        }
        cardNumTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "点击了" + bundle.getInt(INDEX_KEY, 0) + "", Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib1:
                Toast.makeText(getContext(), "1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ib2:
                Toast.makeText(getContext(), "2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ib3:
                Toast.makeText(getContext(), "3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ib4:
                Toast.makeText(getContext(), "4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ib5:
                Toast.makeText(getContext(), "5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ib6:
                Toast.makeText(getContext(), "6", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ib7:
                Toast.makeText(getContext(), "7", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ib8:
                Toast.makeText(getContext(), "8", Toast.LENGTH_SHORT).show();
                break;
//            case R.id.ib9:
//                Toast.makeText(getContext(), "9", Toast.LENGTH_SHORT).show();
//                break;
        }
    }
}