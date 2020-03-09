package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_1 = (TextView) findViewById(R.id.text_1);
        final ListView list_view1 = findViewById(R.id.list_view1);
        final String[] CarNames = getResources(). getStringArray(R.array.array1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, CarNames);
        list_view1.setAdapter(adapter);

        list_view1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                String selectedItem = CarNames[position];
                text_1.setText(selectedItem);
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("YourValueKey", text_1.getText().toString());
                startActivity(i);
            }

        });


    }



}
