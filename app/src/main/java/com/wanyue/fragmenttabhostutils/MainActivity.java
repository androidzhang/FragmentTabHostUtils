package com.wanyue.fragmenttabhostutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wanyue.fragmenttabhostutils.ui.CustomInJavaActivity;
import com.wanyue.fragmenttabhostutils.ui.CustomInXmlActivity;
import com.wanyue.fragmenttabhostutils.ui.QuickStartActivity;
import com.wanyue.fragmenttabhostutils.ui.UseInFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void quick_start(View view) {

        startActivity(new Intent(this, QuickStartActivity.class));
    }

    public void custom_in_xml(View view) {

        startActivity(new Intent(this, CustomInXmlActivity.class));
    }

    public void custom_in_java(View view) {

        startActivity(new Intent(this, CustomInJavaActivity.class));
    }

    public void use_in_fragment(View view) {

        startActivity(new Intent(this, UseInFragment.class));
    }
}
