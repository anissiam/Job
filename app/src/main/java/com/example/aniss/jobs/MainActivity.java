package com.example.aniss.jobs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button profile=(Button)findViewById(R.id.button1);
            profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,
                            Login_Emp_Activity.class);
                    startActivity(intent);
                }
            });

            Button showAll=(Button)findViewById(R.id.button2);
            showAll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,
                            showAllJopsActivity.class);
                    startActivity(intent);
                }
            });

            Button health=(Button)findViewById(R.id.button3);
            health.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplication(),"Health",Toast.LENGTH_SHORT).show();
                }
            });

            Button goals=(Button)findViewById(R.id.button4);
            goals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplication(),"Goals",Toast.LENGTH_SHORT).show();
                }
            });

            Button finance=(Button)findViewById(R.id.button5);
            finance.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplication(),"Finance",Toast.LENGTH_SHORT).show();
                }
            });

            Button comfort=(Button)findViewById(R.id.button6);
            comfort.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplication(),"Comfort",Toast.LENGTH_SHORT).show();
                }
            });
        }
}