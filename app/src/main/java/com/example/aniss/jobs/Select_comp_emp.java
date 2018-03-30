package com.example.aniss.jobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Select_comp_emp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_comp_emp);

    }

    public void camp(View view) {
        Toast.makeText(this, "camp", Toast.LENGTH_SHORT).show();
    }

    public void emply(View view) {
        Intent intent = new Intent(Select_comp_emp.this,
                MainActivity.class);
        startActivity(intent);
    }
}
