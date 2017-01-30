package com.example.kazaf.mytablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Kazaf on 2017/1/29.
 */

public class Fragment2 extends Fragment {

    TextView tv_fragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        tv_fragment = (TextView) view.findViewById(R.id.tv_fragment);
        tv_fragment.setText("fragment2");


        return view;
    }
}
