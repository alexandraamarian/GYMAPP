package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Combined_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combined);
    }
    public void checkInfoLegPress(View v){
        startActivity(new Intent(Combined_Activity.this, LegpressActivity.class));
    }
    public void checkInfoLegExtesnion(View v){
        startActivity(new Intent(Combined_Activity.this, LegExtensionActivity.class));
    }
    public void checkInfoChestPress(View v){
        startActivity(new Intent(Combined_Activity.this, ChestPressActivity.class));
    }
    public void checkInfoCableMachine(View v){
        startActivity(new Intent(Combined_Activity.this, CableMachineActivity.class));
    }
}