package com.umeng.soexample.jpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by W on 2019/4/7 15:56.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);//正式版的时候设置false，关闭调试
        JPushInterface.init(this);

    }
}
