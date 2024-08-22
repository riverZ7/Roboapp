package com.example.application;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity
{
    EditText edtUsername, edtPassword;
    Button btnLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanseState){
        super.onCreate(savedInstanseState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {

            SharedPreferences storePreference = getSharedPreferences("RoboPrefs", MODE_PRIVATE);
             SharedPreferences.Editor sharedPrefEditor = storePreference.edit();  //edit is storing the data
            sharedPrefEditor.putString("username",edtUsername.getText().toString());
                sharedPrefEditor.apply();

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            /*Toast
           We use a toast to display meesage to the user
             */
            Toast.makeText(this,"Login successful", Toast.LENGTH_LONG).show();
        });



    }
    }





