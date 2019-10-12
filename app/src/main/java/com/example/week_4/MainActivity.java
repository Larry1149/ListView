package com.example.week_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartActivity = findViewById(R.id.btnStartActivity);

    }

    public void StartActivity2(View v){
        Intent i = new Intent(this,ListViewActivity.class);
        startActivity(i);
    }
}
