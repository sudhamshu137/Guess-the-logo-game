package com.example.logoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class windows extends AppCompatActivity {

    public int keys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows);

        Bundle firstData = getIntent().getExtras();
        keys = firstData.getInt("firstMessage");

        Button key = (Button) findViewById(R.id.key);
        key.setText("      " + keys);

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, lists.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    String ss = "";
    int n = 0;

    public void w(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="w";
        text.setText(ss);
        correct();
        Button wwww = (Button) findViewById(R.id.fff);
        wwww.setEnabled(false);
    }

    public void ww(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="w";
        text.setText(ss);
        correct();
        Button www = (Button) findViewById(R.id.www);
        www.setEnabled(false);
    }

    public void i(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="i";
        text.setText(ss);
        correct();
        Button iii = (Button) findViewById(R.id.tttt);
        iii.setEnabled(false);
    }

    public void z(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="z";
        text.setText(ss);
        correct();
        Button zzz = (Button) findViewById(R.id.zzz);
        zzz.setEnabled(false);
    }

    public void o(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="o";
        text.setText(ss);
        correct();
        Button ooo = (Button) findViewById(R.id.ttttt);
        ooo.setEnabled(false);
    }

    public void s(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="s";
        text.setText(ss);
        correct();
        Button sss = (Button) findViewById(R.id.sss);
        sss.setEnabled(false);
    }

    public void c(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="c";
        text.setText(ss);
        correct();
        Button ccc = (Button) findViewById(R.id.lll);
        ccc.setEnabled(false);
    }

    public void p(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="p";
        text.setText(ss);
        correct();
        Button ppp = (Button) findViewById(R.id.ppp);
        ppp.setEnabled(false);
    }

    public void d(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="d";
        text.setText(ss);
        correct();
        Button ddd = (Button) findViewById(R.id.eee);
        ddd.setEnabled(false);
    }

    public void n(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="n";
        text.setText(ss);
        correct();
        Button nnn = (Button) findViewById(R.id.iii);
        nnn.setEnabled(false);
    }

    public void retry(View view){
        n = -1;
        TextView text = (TextView) findViewById(R.id.text);
        ss="";
        text.setText("");
        correct();
        Button cor = (Button) findViewById(R.id.correct);
        cor.setText("");

        Button www = (Button) findViewById(R.id.www);
        www.setEnabled(true);
        Button wwww = (Button) findViewById(R.id.fff);
        wwww.setEnabled(true);
        Button iii = (Button) findViewById(R.id.tttt);
        iii.setEnabled(true);
        Button zzz = (Button) findViewById(R.id.zzz);
        zzz.setEnabled(true);
        Button ooo = (Button) findViewById(R.id.ttttt);
        ooo.setEnabled(true);
        Button sss = (Button) findViewById(R.id.sss);
        sss.setEnabled(true);
        Button ppp = (Button) findViewById(R.id.ppp);
        ppp.setEnabled(true);
        Button nnn = (Button) findViewById(R.id.iii);
        nnn.setEnabled(true);
        Button ccc = (Button) findViewById(R.id.lll);
        ccc.setEnabled(true);
        Button ddd = (Button) findViewById(R.id.eee);
        ddd.setEnabled(true);
    }

    public void correct(){
        n++;
        Button cor = (Button) findViewById(R.id.correct);
        cor.setText("");
        if(n==7){
            if(ss.equals("windows")){
                cor.setText("✅");
                keys = keys + 3;
                Button key = (Button) findViewById(R.id.key);
                key.setText("      " + keys);
            }
            if(!(ss.equals("windows"))){
                cor.setText("❌");
            }
        }
    }

    public void next(View view){
        Intent i = new Intent(this, apple.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }
    public void previous(View view){
        Intent i = new Intent(this, amazon.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

}
