package com.wanyue.fragmenttabhostutils.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.wanyue.fragmenttabhostutils.R;
import com.wanyue.fragmenttabhostutils.fragment.FragmentSample;

public class UseInFragment extends FragmentActivity {

    private FragmentSample fragmentSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.use_in_fragment);
        fragmentSample = new FragmentSample();


        getFragmentManager().beginTransaction().add(R.id.frame, fragmentSample).show(fragmentSample).commit();


    }
}
