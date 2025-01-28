package com.cynte.android_demo_lib;

import android.util.Log;

import com.cynte.test_lib.DateUtil;

import java.util.Date;

public class Hello {
    public static void main(String[] args) {
        /// Main Method

    }
    /// Prints Message with Tag in Logcat!
    public static void printLog(String tag, String message) {
        Log.d(tag, DateUtil.getDate());
        Log.d(tag, message);
    }
}
