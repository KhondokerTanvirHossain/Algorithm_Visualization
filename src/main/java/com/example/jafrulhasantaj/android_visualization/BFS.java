package com.example.jafrulhasantaj.android_visualization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BFS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfs);
    }
    public void Simulation(View v){
        Intent intent = new Intent(this,Simulation_bfs.class);
        startActivity(intent);
    }
}
