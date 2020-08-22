package com.example.logoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class amazon extends AppCompatActivity {

    public int keys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);

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


    public void a(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="a";
        text.setText(ss);
        correct();
        Button aaaa = (Button) findViewById(R.id.fff);
        aaaa.setEnabled(false);
    }

    public void aa(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="a";
        text.setText(ss);
        correct();
        Button aaa = (Button) findViewById(R.id.www);
        aaa.setEnabled(false);
    }

    public void m(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="m";
        text.setText(ss);
        correct();
        Button mmm = (Button) findViewById(R.id.tttt);
        mmm.setEnabled(false);
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

    public void n(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="n";
        text.setText(ss);
        correct();
        Button nnn = (Button) findViewById(R.id.sss);
        nnn.setEnabled(false);
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

    public void q(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="q";
        text.setText(ss);
        correct();
        Button qqq = (Button) findViewById(R.id.eee);
        qqq.setEnabled(false);
    }

    public void v(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="v";
        text.setText(ss);
        correct();
        Button vvv = (Button) findViewById(R.id.iii);
        vvv.setEnabled(false);
    }

    public void retry(View view){
        n = -1;
        TextView text = (TextView) findViewById(R.id.text);
        ss="";
        text.setText("");
        correct();
        Button cor = (Button) findViewById(R.id.correct);
        cor.setText("");

        Button aaa = (Button) findViewById(R.id.www);
        aaa.setEnabled(true);
        Button aaaa = (Button) findViewById(R.id.fff);
        aaaa.setEnabled(true);
        Button mmm = (Button) findViewById(R.id.tttt);
        mmm.setEnabled(true);
        Button zzz = (Button) findViewById(R.id.zzz);
        zzz.setEnabled(true);
        Button ooo = (Button) findViewById(R.id.ttttt);
        ooo.setEnabled(true);
        Button nnn = (Button) findViewById(R.id.sss);
        nnn.setEnabled(true);
        Button ppp = (Button) findViewById(R.id.ppp);
        ppp.setEnabled(true);
        Button vvv = (Button) findViewById(R.id.iii);
        vvv.setEnabled(true);
        Button ccc = (Button) findViewById(R.id.lll);
        ccc.setEnabled(true);
        Button qqq = (Button) findViewById(R.id.eee);
        qqq.setEnabled(true);
    }

    public void correct(){
        n++;
        Button cor = (Button) findViewById(R.id.correct);
        cor.setText("");
        if(n==6){
            if(ss.equals("amazon")){
                cor.setText("✅");
                keys = keys + 3;
                Button key = (Button) findViewById(R.id.key);
                key.setText("      " + keys);
            }
            if(!(ss.equals("amazon"))){
                cor.setText("❌");
            }
        }
    }

    public void next(View view){
        Intent i = new Intent(this, windows.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }


}
