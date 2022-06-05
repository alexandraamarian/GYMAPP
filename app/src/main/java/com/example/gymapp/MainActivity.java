package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.gymapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
        //create a list of items for the spinner.
        String[] focus = new String[]{"All","Upper Body", "Lower Body"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, focus);
        //set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);


        Spinner dropdown2 = findViewById(R.id.spinner2);
        //create a list of items for the spinner.
        String[] injuries = new String[]{"None","Leg", "Arm"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, injuries);
        //set the spinners adapter to the previously created one.
        dropdown2.setAdapter(adapter2);


        //bold textView2
        TextView Tv2 = (TextView) findViewById(R.id.textView2);
        Typeface boldTypeface2 = Typeface.defaultFromStyle(Typeface.BOLD);
        Tv2.setTypeface(boldTypeface2);

        //bold textView2
        TextView Tv3 = (TextView) findViewById(R.id.textView3);
        Typeface boldTypeface3 = Typeface.defaultFromStyle(Typeface.BOLD);
        Tv3.setTypeface(boldTypeface3);



    }

    public void continueMethod(View v){
        Spinner spinner_focus = (Spinner)findViewById(R.id.spinner1);
        String text_focus = spinner_focus.getSelectedItem().toString();

        Spinner spinner_injury = (Spinner)findViewById(R.id.spinner2);
        String text_injury = spinner_injury.getSelectedItem().toString();
        if(text_focus =="All" && text_injury == "None")
        {
            startActivity(new Intent(MainActivity.this, Combined_Activity.class));
        }
        else if(text_focus =="All" && text_injury == "Leg")
        {
            startActivity(new Intent(MainActivity.this, Arms_Activity.class));
        }
        else if(text_focus =="All" && text_injury == "Arm")
        {
            startActivity(new Intent(MainActivity.this, FilteringActivity.class));
        }
        else if(text_focus =="Upper Body" && text_injury == "Leg")
        {
            startActivity(new Intent(MainActivity.this, Arms_Activity.class));
        }
        else if(text_focus =="Upper Body" && text_injury == "None")
        {
            startActivity(new Intent(MainActivity.this, Arms_Activity.class));
        }
        else if(text_focus =="Lower Body" && text_injury == "Arm")
        {
            startActivity(new Intent(MainActivity.this, FilteringActivity.class));
        }
        else if(text_focus =="Lower Body" && text_injury == "None")
        {
            startActivity(new Intent(MainActivity.this, FilteringActivity.class));
        }
        else
        {
            startActivity(new Intent(MainActivity.this, Invalid_Option_Activity.class));
        }
    }
}