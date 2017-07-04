package com.wanyue.tabviewlibrary.tabview;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by zlx on 2017/7/4.
 */

public class TabViewUtil {

    public TabViewUtil() {
    }
    public static int dp2px(Context context, float dpValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.getResources().getDisplayMetrics());
    }

    public static int sp2px(Context context, float spValue) {
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, spValue, context.getResources().getDisplayMetrics());
    }
}
