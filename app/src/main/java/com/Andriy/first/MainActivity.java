package com.Andriy.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1 (View v) {
    Intent intent = new Intent (this, SecomdActivity.class);
    startActivity(intent);
    }

    public void onClick2 (View v) {
        Intent intent = new Intent (this, ThirdActivity.class);
        startActivity(intent);
    }
}