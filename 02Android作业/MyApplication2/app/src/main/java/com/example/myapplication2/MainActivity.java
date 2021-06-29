package com.example.myapplication2;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button button;
    EditText name;
    EditText age;
    EditText birthday;
    EditText email;
    EditText hobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取按钮及文本框
        Button button  = (Button)findViewById(R.id.button);
        name = (EditText)findViewById(R.id.textname) ;
        age = (EditText)findViewById(R.id.textage) ;
        birthday = (EditText)findViewById(R.id.textbirthday) ;
        email = (EditText)findViewById(R.id.TextEmail) ;
        hobby = (EditText)findViewById(R.id.texthobby) ;
        //创建点击事件
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                checkClick(name.getText().toString(),age.getText().toString(),birthday.getText().toString(),email.getText().toString(),hobby.getText().toString());
            }
        });

    }
    public void checkClick(String name,String age,String birthday,String email,String hobby){
        if (name!=null && age!=null && birthday!=null && email!=null && hobby!=null){
            //意图是对要执行的操作的抽象描述。它可用于startActivity启动Activity， broadcastIntent将其发送到任何感兴趣的BroadcastReceiver组件，
            // Context.startService(Intent)或 Context.bindService(Intent, ServiceConnection, int)与后台通信Service。
            Intent intent=new Intent(this,ShowActivity.class);
            //传值
            intent.putExtra("name",name);
            intent.putExtra("age",age);
            intent.putExtra("birthday",birthday);
            intent.putExtra("email",email);
            intent.putExtra("hobby",hobby);
            //startActivity
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this,"输入不能为空",Toast.LENGTH_SHORT).show();
        }
    }
}