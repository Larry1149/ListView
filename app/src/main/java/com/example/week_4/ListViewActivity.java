package com.example.week_4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    private ListView listview;
    private ArrayList<String> names = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listview = findViewById(R.id.listview);

        names.add("John");
        names.add("Nicholas");
        names.add("Kar Chun");
        names.add("Naomi");
        names.add("Guo Dong");
        names.add("Small John");

        ArrayAdapter<String> nameAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        listview.setAdapter(nameAdapter);
    }
}
