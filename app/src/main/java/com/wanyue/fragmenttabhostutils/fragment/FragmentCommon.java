package com.wanyue.fragmenttabhostutils.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wanyue.fragmenttabhostutils.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCommon extends Fragment {


    private TextView textview;

    public static FragmentCommon newInstance(String text) {

        FragmentCommon fragmentCommon = new FragmentCommon();


        Bundle bundle = new Bundle();


        bundle.putString("text", text);


        fragmentCommon.setArguments(bundle);


        return fragmentCommon;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_common, container, false);

        textview = (TextView) view.findViewById(R.id.textView);


        textview.setText(getArguments().getString("text"));


        return view;
    }

}
