package com.brioal.nightthemetest;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by brioal on 16-11-3.
 * Email : brioal@foxmail.com
 * Github : https://github.com/Brioal
 */

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_AUTO);
    }
}
