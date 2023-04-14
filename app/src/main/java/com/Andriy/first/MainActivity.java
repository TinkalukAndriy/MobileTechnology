package com.Andriy.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");
        TextView usernameTextView = findViewById(R.id.usernameTextView);
        TextView passwordTextView = findViewById(R.id.passwordTextView);
        usernameTextView.setText(username);
        passwordTextView.setText(password);
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