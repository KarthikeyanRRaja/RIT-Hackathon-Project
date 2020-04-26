package com.example.ndf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void action_btn1(View v) {
        Intent i = new Intent(MainActivity.this, NeedFood.class);
        startActivity(i);
    }

    public void action_btn2(View v) {
        Intent i = new Intent(MainActivity.this, DonateFood.class);
        startActivity(i);
    }
    public void action_btn3(View v) {
        Intent i = new Intent(MainActivity.this, ReviwerOpt.class);
        startActivity(i);
    }
}