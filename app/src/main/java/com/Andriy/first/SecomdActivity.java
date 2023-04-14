package com.Andriy.first;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecomdActivity extends AppCompatActivity {
 private EditText usernameEditText;
 private EditText passwordEditText;
 private SharedPreferences pref;
 private final String save_key = "username";
 private final String save_key1 = "password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secomd);
        init ();
    }


    public void onClick (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);}

    public void OnclickSave (View v) {
    SharedPreferences.Editor edit = pref.edit();
    edit.putString(save_key,usernameEditText.getText().toString());
    edit.putString(save_key1,passwordEditText.getText().toString());
    edit.apply();
        Intent intent = new Intent(this, MainActivity.class);
        String username = pref.getString(save_key, "");
        String password = pref.getString(save_key1, "");
        intent.putExtra("username", username);
        intent.putExtra("password", password);
        startActivity(intent);
    }
    private void init () {
        pref = getSharedPreferences("text", MODE_PRIVATE);
        usernameEditText = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextNumberPassword);
    }
}