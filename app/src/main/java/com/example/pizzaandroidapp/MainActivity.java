package com.example.pizzaandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Spinner list;
    String data[]={"Aprajita","Priyanshi","Agrima","Ananya","Dipanshu","Kajal","Shashank","Akanshit","Ritik","Vineet"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(Spinner)findViewById(R.id.listview);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //TextView txt=(TextView)view;
                //Toast.makeText(MainActivity.this,txt.getText().toString(), (Toast.LENGTH_SHORT));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
