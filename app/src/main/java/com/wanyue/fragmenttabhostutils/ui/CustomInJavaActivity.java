package com.wanyue.fragmenttabhostutils.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.wanyue.fragmenttabhostutils.R;
import com.wanyue.fragmenttabhostutils.fragment.FragmentCommon;
import com.wanyue.tabviewlibrary.tabview.TabView;
import com.wanyue.tabviewlibrary.tabview.TabViewChild;
import com.wanyue.tabviewlibrary.tabview.TabViewUtil;

import java.util.ArrayList;
import java.util.List;

public class CustomInJavaActivity extends FragmentActivity {

    private TabView tabView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_start_activity);

        tabView = (TabView) findViewById(R.id.tabView);
        //start add data
        List<TabViewChild> tabViewChildList = new ArrayList<>();
        TabViewChild tabViewChild01 = new TabViewChild(R.drawable.tab01_sel, R.drawable.tab01_unsel, "首页", FragmentCommon.newInstance("首页"));
        TabViewChild tabViewChild02 = new TabViewChild(R.drawable.tab02_sel, R.drawable.tab02_unsel, "分类", FragmentCommon.newInstance("分类"));
        TabViewChild tabViewChild03 = new TabViewChild(R.drawable.tab03_sel, R.drawable.tab03_unsel, "资讯", FragmentCommon.newInstance("资讯"));
        TabViewChild tabViewChild04 = new TabViewChild(R.drawable.tab04_sel, R.drawable.tab04_unsel, "购物车", FragmentCommon.newInstance("购物车"));
        TabViewChild tabViewChild05 = new TabViewChild(R.drawable.tab05_sel, R.drawable.tab05_unsel, "我的", FragmentCommon.newInstance("我的"));
        tabViewChildList.add(tabViewChild01);
        tabViewChildList.add(tabViewChild02);
        tabViewChildList.add(tabViewChild03);
        tabViewChildList.add(tabViewChild04);
        tabViewChildList.add(tabViewChild05);
        //end add data
        //start custom style
        tabView.setTextViewSelectedColor(Color.BLUE);
        tabView.setTextViewUnSelectedColor(Color.BLACK);
        tabView.setTabViewBackgroundColor(Color.YELLOW);
        tabView.setTabViewHeight(TabViewUtil.dp2px(this, 52));
        tabView.setImageViewTextViewMargin(2);
        tabView.setTextViewSize(14);
        tabView.setImageViewWidth(TabViewUtil.dp2px(this, 30));
        tabView.setImageViewHeight(TabViewUtil.dp2px(this, 30));
        tabView.setTabViewGravity(Gravity.TOP);
        tabView.setTabViewDefaultPosition(2);
        //end of custom
        tabView.setTabViewChild(tabViewChildList, getFragmentManager());
        tabView.setOnTabChildClickListener(new TabView.OnTabChildClickListener() {
            @Override
            public void onTabChildClick(int position, ImageView currentImageIcon, TextView currentTextView) {
                 Toast.makeText(getApplicationContext(),"position:"+position,Toast.LENGTH_SHORT).show();
            }
        });


    }
}