package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ShowClient.class);
                startActivity(i);
            }
        });
    }

    //String json_string = "[{'code':'101','name':'ICICI'},{'code':'105',name:'HDFC'},{'code':'250','name':'Sterling'},{'code':'159','name':'Aadarsh'}]";
    //JSONArray jsonArray = null;
    //JSONObject jsonObject;


}
