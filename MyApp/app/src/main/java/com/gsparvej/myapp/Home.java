package com.gsparvej.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    private Button btnScienceFic , btnBengaliHis , btnMaths , btnPhy , btnHealth , btnTech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        btnScienceFic = findViewById(R.id.btnScienceFik);
        btnBengaliHis = findViewById(R.id.btnBengali);
        btnMaths = findViewById(R.id.btnMaths);
        btnPhy = findViewById(R.id.btnPhy);

        btnScienceFic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScienceFiction.class);
                startActivity(intent);
            }
        });



        btnBengaliHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BegaliHistory.class);
                startActivity(intent);
            }
        });



        btnMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Maths.class);
                startActivity(intent);
            }
        });



        btnPhy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Physics.class);
                startActivity(intent);
            }
        });

        btnHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Health.class);
                startActivity(intent);
            }
        });



        btnTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Technology.class);
                startActivity(intent);
            }
        });







    }


}