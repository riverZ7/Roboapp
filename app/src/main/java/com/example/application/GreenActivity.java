package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GreenActivity extends AppCompatActivity {
    Button btnRed ,btnGreen,btnYellow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green);

        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnYellow = findViewById(R.id.btnYellow);

        btnRed.setOnClickListener(view -> {
            //navigate to red activity
            Intent redIntent = new Intent(this,RedActivity.class);
            startActivity(redIntent);
        });

        btnYellow.setOnClickListener(view -> {
            //navigate to Yellow  activity
            Intent yellowIntent = new Intent(this,YellowActivity.class);
            startActivity(yellowIntent);
        });
    }
}
