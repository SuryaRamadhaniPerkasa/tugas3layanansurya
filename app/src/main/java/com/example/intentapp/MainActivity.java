package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desain);
    }

    public void clickHospital(View view) {
        //klik icon Rumah Sakit
        Intent intent = new Intent(this, RumahSakit.class);
        startActivity(intent);
    }
}