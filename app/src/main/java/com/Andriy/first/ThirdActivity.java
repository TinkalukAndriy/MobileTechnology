package com.Andriy.first;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    private EditText usernameEditText1;
    private EditText passwordEditText1;
    private SharedPreferences pref1;
    private final String save_key2 = "save_key";
    private final String save_key3 = "save_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        init1();
    }

    public void onClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);}

    public void OnclickSave1 (View v) {
        SharedPreferences.Editor edit = pref1.edit();
        edit.putString(save_key2,usernameEditText1.getText().toString());
        edit.putString(save_key3,passwordEditText1.getText().toString());
        edit.apply();
    }
    private void init1 () {
        pref1 = getSharedPreferences("text", MODE_PRIVATE);
        usernameEditText1 = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText1 = findViewById(R.id.editTextNumberPassword);
    }
}
