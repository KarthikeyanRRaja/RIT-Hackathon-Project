package com.example.ndf;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ReviwerOpt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviwer_opt);
    }
    public void action_btn3(View v) {
        Intent i = new Intent(ReviwerOpt.this,RequestList.class);
        startActivity(i);
    }
    public void action_btn4(View v) {
        Intent i = new Intent(ReviwerOpt.this,DonarStack.class);
        startActivity(i);
    }
}
