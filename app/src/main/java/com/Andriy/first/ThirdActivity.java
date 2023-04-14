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
    private SharedPreferences pref3;
    private SharedPreferences pref1;
    private final String save_key2 = "username1";
    private final String save_key3 = "password1";
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
        Intent intent = new Intent(this, MainActivity.class);
        String username = pref1.getString(save_key2, "");
        String password = pref1.getString(save_key3, "");
        intent.putExtra("username", username);
        intent.putExtra("password", password);
        startActivity(intent);
    }
    private void init1 () {
        pref1 = getSharedPreferences("text", MODE_PRIVATE);
        pref3 = getSharedPreferences("text", MODE_PRIVATE);
        usernameEditText1 = findViewById(R.id.editTextTextEmailAddress2);
        passwordEditText1 = findViewById(R.id.editTextTextPassword);
    }
}
