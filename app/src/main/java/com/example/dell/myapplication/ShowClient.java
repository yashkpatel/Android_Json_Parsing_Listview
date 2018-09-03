package com.example.dell.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Dell on 03-09-2018.
 */

public class ShowClient extends AppCompatActivity {

    ListView clientListView;
    ArrayList<String> list;
    String json_string = "[{'code':'101','name':'ICICI'},{'code':'105',name:'HDFC'},{'code':'250','name':'Sterling'},{'code':'159','name':'Aadarsh'}]";
    JSONArray jsonArray = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_clients);

        clientListView = (ListView)findViewById(R.id.clientDetailsList);

        try {
            list = new ArrayList<>();
            jsonArray = new JSONArray(json_string);
            for(int i=0; i<jsonArray.length();i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String code = jsonObject.getString("code");
                String name = jsonObject.getString("name");
                String merge = "Client Code : "+code+"  Client Name : "+name;
                list.add(merge);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.row,R.id.showClient_id ,list);

        clientListView.setAdapter(arrayAdapter);
    }
}
