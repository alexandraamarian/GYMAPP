package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FilteringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtering);

    }
    public void checkInfoLegPress(View v){
        startActivity(new Intent(FilteringActivity.this, LegpressActivity.class));
    }
    public void checkInfoLegExtesnion(View v){
        startActivity(new Intent(FilteringActivity.this, LegExtensionActivity.class));
    }
    public void checkInfoHackSquat(View v){
        startActivity(new Intent(FilteringActivity.this, HackSquatActivity.class));
    }
    public void checkInfoInnerThigh(View v){
        startActivity(new Intent(FilteringActivity.this, InnerThighActivity.class));
    }
}