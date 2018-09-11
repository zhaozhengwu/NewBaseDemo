package com.example.muheda.newbasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import Tool.IToastListener;
import Tool.ToastUtils;

public class MainActivity extends AppCompatActivity {
    private Button btn_toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        btn_toast=findViewById(R.id.btn_toast);
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.showPop(MainActivity.this,R.layout.toast_item);
                //自定义时长 默认位置
                //ToastUtils.makeToast(MainActivity.this,"上边",1000).show();
               // ToastUtils.showShort(MainActivity.this,"短时间");
                //ToastUtils.makeToast(MainActivity.this,"上面",Toast.LENGTH_SHORT,Gravity.CENTER).show();
               // ToastUtils.makeToast(MainActivity.this,"自定义布局",R.layout.toast_item,Toast.LENGTH_SHORT,Gravity.BOTTOM).show();
                ToastUtils.makeToast(MainActivity.this, "自定义布局广泛的苟富贵更多更反感个地方官的", R.layout.toast_item, Gravity.CENTER, Toast.LENGTH_SHORT, 0, 0, new IToastListener<String>() {
                    @Override
                    public void toastListener(String s) {
                        System.out.println("--------------s---"+s);
                    }
                }).show();
            }
        });
        ToastUtils.showDialog().showSuccessDialog(MainActivity.this,false);
    }
}
