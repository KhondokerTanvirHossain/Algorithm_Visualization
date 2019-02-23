package com.example.jafrulhasantaj.android_visualization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bubble_sort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_sort);
        TextView textView = (TextView) findViewById(R.id.text1);


    }

    public void Simulation(View v){
        Intent intent = new Intent(this,Simulation_bsort.class);
        startActivity(intent);
    }
}
