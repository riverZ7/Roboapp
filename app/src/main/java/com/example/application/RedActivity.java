package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RedActivity extends AppCompatActivity {
    Button btnRed ,btnGreen,btnYellow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);

        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnYellow = findViewById(R.id.btnYellow);

        btnGreen.setOnClickListener(view -> {
            //navigate to green activity
            Intent greenIntent = new Intent(this,GreenActivity.class);
            startActivity(greenIntent);
        });
        btnYellow.setOnClickListener(view -> {
            //navigate to Yellow  activity
            Intent yellowIntent = new Intent(this,YellowActivity.class);
            startActivity(yellowIntent);
        });


    }

}
