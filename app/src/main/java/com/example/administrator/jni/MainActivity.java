package com.example.administrator.jni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mylibrary.ToastTool;
import com.google.gson.Gson;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

public class MainActivity extends AppCompatActivity {
    private Jni myjni;

    @ViewInject(R.id.sample_text)
    private TextView tv;

    @OnClick({R.id.btn})
    private void click(View view){
        switch (view.getId()){
            case R.id.btn:
                tv.setText("加法："+ myjni.add(5, 3) + "--最小值"+ myjni.min(5,3));
                ToastTool.showtoast(MainActivity.this,myjni.max(4,2)+"");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);
        // Example of a call to a native method
        myjni = new Jni();
    }
}
