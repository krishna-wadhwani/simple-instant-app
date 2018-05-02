package com.wayfair.simpleinstantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public void buttonClicked(View v){
        Toast.makeText(this, "Avengers Spoilers Ahead", Toast.LENGTH_SHORT).show();
    }
}
