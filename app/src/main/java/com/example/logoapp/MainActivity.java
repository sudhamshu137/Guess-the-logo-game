package com.example.logoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public int keys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button key = (Button) findViewById(R.id.key);
        keys = 0;
        key.setText("      " + keys);

    }

    public void start(View view){
        Intent i = new Intent(this, lists.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

}
