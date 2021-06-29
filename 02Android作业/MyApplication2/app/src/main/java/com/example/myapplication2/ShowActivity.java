package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.EditText;

public class ShowActivity extends AppCompatActivity {
    String name;
    String age;
    String birthday;
    String email;
    String hobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent=getIntent();
        name = intent.getStringExtra("name");
        age = intent.getStringExtra("age");
        birthday = intent.getStringExtra("birthday");
        email = intent.getStringExtra("email");
        hobby = intent.getStringExtra("hobby");
        EditText t1 = (EditText)findViewById(R.id.t1);
        EditText t2 = (EditText)findViewById(R.id.t2);
        EditText t3 = (EditText)findViewById(R.id.t3);
        EditText t4 = (EditText)findViewById(R.id.t4);
        EditText t5 = (EditText)findViewById(R.id.t5);
        t1.setText(name);
        t2.setText(age);
        t3.setText(birthday);
        t4.setText(email);
        t5.setText(hobby);
    }
}