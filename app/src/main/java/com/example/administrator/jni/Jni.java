package com.example.administrator.jni;

/**
 * Created by Administrator on 2016/12/28 0028.
 */

public class Jni {
    static{
        System.loadLibrary("native-lib");
    }

    public native int add(int a , int b);
    public native int min(int a,int b);
    public static native int max(int a,int b);
}
