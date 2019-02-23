package com.example.jafrulhasantaj.android_visualization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TowerOfHanoy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tower_of_hanoy);
    }
    public void Simulation(View v){
        Intent intent = new Intent(this,Simulation_toh.class);
        startActivity(intent);

    }
}
