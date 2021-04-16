package com.android.internshipprogram;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "PAN Card servers are not responding at the moment. Please try again later.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 180);
        View view = toast.getView();
        view.setBackgroundColor(Color.DKGRAY);
        TextView text = (TextView) view.findViewById(android.R.id.message);
        text.setTextColor(Color.parseColor("#FFFFFF"));
        toast.show();
    }
}