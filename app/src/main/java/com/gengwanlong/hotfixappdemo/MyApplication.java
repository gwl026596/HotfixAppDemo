package com.gengwanlong.hotfixappdemo;

import android.app.Application;

import com.tencent.bugly.Bugly;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(getApplicationContext(), "b180caee5e", false);
    }
}
