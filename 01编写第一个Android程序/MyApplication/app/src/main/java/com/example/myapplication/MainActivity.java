package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.editTextTextUserNmae);
        password = (EditText)findViewById(R.id.editTextTextPassword);

        btn = (Button)findViewById(R.id.button);
        //https://developer.android.google.cn/guide/topics/ui/controls/button?hl=en#java
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // btn被点击时
                checkUser(username.getText().toString(),password.getText().toString());
            }
        });

    }

    public void checkUser(String username,String password){
        if (username.equals("404nofound")&&password.equals("wojiushimima")) {
            //	makeText(Context context, int resId, int duration)
            //  制作一个仅包含来自资源的文本的标准吐司。
            //context	Context: 要使用的上下文。通常是您的Application 或Activity对象。
            //resId	int：要使用的字符串资源的资源 ID。可以格式化文本。
            //duration	int：显示消息的时间。无论是或 值是，或LENGTH_SHORT LENGTH_LONG LENGTH_SHOR TLENGTH_LONG
            Toast.makeText(MainActivity.this, "登入成功", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this, "账号或者密码错误", Toast.LENGTH_SHORT).show();
        }
    }

}