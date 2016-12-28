package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/12/28 0028.
 */

public class ToastTool {
    private static Toast toast=null;
    public static void showtoast(Context context, String str){
        if(toast==null){
            toast=Toast.makeText(context,str,Toast.LENGTH_LONG );
        }else{
            toast.setText(str);
        }
        toast.show();
    }
}
