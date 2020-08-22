package com.example.logoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lists extends AppCompatActivity {

    public int keys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        Bundle firstData = getIntent().getExtras();
        keys = firstData.getInt("firstMessage");

        Button key = (Button) findViewById(R.id.key);
        key.setText("      " + keys);

    }


    public void amazon(View view){
        Intent i = new Intent(this, amazon.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }
    
    public void windows(View view){
        Intent i = new Intent(this, windows.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void apple(View view){
        Intent i = new Intent(this, apple.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void twitter(View view){
        Intent i = new Intent(this, twitter.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void flipkart(View view){
        Intent i = new Intent(this, flipkart.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void samsung(View view){
        Intent i = new Intent(this, samsung.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void linux(View view){
        Intent i = new Intent(this, linux.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void youtube(View view){
        Intent i = new Intent(this, youtube.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void wb(View view){
        Intent i = new Intent(this, wb.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void ikea(View view){
        Intent i = new Intent(this, ikea.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void gmail(View view){
        Intent i = new Intent(this, gmail.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void dell(View view){
        Intent i = new Intent(this, dell.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void honda(View view){
        Intent i = new Intent(this, honda.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void adidas(View view){
        Intent i = new Intent(this, adidas.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void cocacola(View view){
        Intent i = new Intent(this, cocacola.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void predator(View view){
        Intent i = new Intent(this, predator.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void hyundai(View view){
        Intent i = new Intent(this, hyundai.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void blackberry(View view){
        Intent i = new Intent(this, blackberry.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void fogg(View view){
        Intent i = new Intent(this, fogg.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void ups(View view){
        Intent i = new Intent(this, ups.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }



    
}
