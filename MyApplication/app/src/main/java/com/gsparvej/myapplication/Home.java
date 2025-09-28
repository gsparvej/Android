package com.gsparvej.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {
    private LinearLayout btnArithmetic, btnAlgebra, btnIndex, btnLog, btnSeries, btnTrigonometry, btnMeasurement, btnGeometry, btnStatistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);


        // Initialize all buttons
        btnArithmetic = findViewById(R.id.btnArithmetic);
        btnAlgebra = findViewById(R.id.btnAlgebra);
        btnIndex = findViewById(R.id.btnIndex);
        btnLog = findViewById(R.id.btnLogarithm);
        btnSeries = findViewById(R.id.btnSeries);
        btnTrigonometry = findViewById(R.id.btnTrigonometry);
        btnMeasurement = findViewById(R.id.btnMeasurement);
        btnGeometry = findViewById(R.id.btnGeometry);
        btnStatistics = findViewById(R.id.btnStatistics);


        // Set click listeners

        btnArithmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Arithmetic.class);
                startActivity(intent);
            }
        });

        btnAlgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Algebra.class);
                startActivity(intent);
            }
        });

        btnIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Index.class);
                startActivity(intent);
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Logarithm.class);
                startActivity(intent);
            }
        });

        btnSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Series.class);
                startActivity(intent);
            }
        });

        btnTrigonometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Trigonometry.class);
                startActivity(intent);
            }
        });

        btnMeasurement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Measurement.class);
                startActivity(intent);
            }
        });

        btnGeometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Geometry.class);
                startActivity(intent);
            }
        });

        btnStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Statistics.class);
                startActivity(intent);
            }
        });


    }
}