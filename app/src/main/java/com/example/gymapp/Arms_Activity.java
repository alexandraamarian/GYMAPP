package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Arms_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);
    }
    public void checkInfoChestPress(View v){
        startActivity(new Intent(Arms_Activity.this, ChestPressActivity.class));
    }

    public void checkInfoCableMachine(View v){
        startActivity(new Intent(Arms_Activity.this, CableMachineActivity.class));
    }
    public void checkInfoSeatedRow(View v){
        startActivity(new Intent(Arms_Activity.this, SeatedRowActivity.class));
    }
    public void checkLapPullDown(View v){
        startActivity(new Intent(Arms_Activity.this, LapPullDownActivity.class));
    }
}