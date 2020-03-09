package com.example.cars;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity {

    //String[] data = {"Volkswagen", "Tesla", "Honda", "ZAZ", "BMW"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android*/

        Spinner spinner = findViewById(R.id.spinner1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner,
                getResources().getStringArray(R.array.cars)
        );
        adapter.setDropDownViewResource(R.layout.custom_spinner_dropdown);
        spinner.setAdapter(adapter);
    }


        public void PressButton (View view){
        TextView text_1 = (TextView) findViewById(R.id.text_1);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        String selectCar = String.valueOf(spinner1.getSelectedItem());
        text_1.setText(selectCar);


    }


    }



