package com.example.logoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dell extends AppCompatActivity {

    public int keys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dell);

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

    public void pp(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="p";
        text.setText(ss);
        correct();
        Button pppp = (Button) findViewById(R.id.fff);
        pppp.setEnabled(false);
    }

    public void i(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="d";
        text.setText(ss);
        correct();
        Button iii = (Button) findViewById(R.id.tttt);
        iii.setEnabled(false);
    }

    public void z(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="l";
        text.setText(ss);
        correct();
        Button zzz = (Button) findViewById(R.id.zzz);
        zzz.setEnabled(false);
    }

    public void s(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="s";
        text.setText(ss);
        correct();
        Button sss = (Button) findViewById(R.id.sss);
        sss.setEnabled(false);
    }

    public void l(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="l";
        text.setText(ss);
        correct();
        Button lll = (Button) findViewById(R.id.lll);
        lll.setEnabled(false);
    }

    public void p(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="p";
        text.setText(ss);
        correct();
        Button ppp = (Button) findViewById(R.id.ppp);
        ppp.setEnabled(false);
    }

    public void e(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="e";
        text.setText(ss);
        correct();
        Button eee = (Button) findViewById(R.id.eee);
        eee.setEnabled(false);
    }

    public void a(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="a";
        text.setText(ss);
        correct();
        Button aaa = (Button) findViewById(R.id.iii);
        aaa.setEnabled(false);
    }

    public void retry(View view){
        n = -1;
        TextView text = (TextView) findViewById(R.id.text);
        ss="";
        text.setText("");
        correct();
        Button cor = (Button) findViewById(R.id.correct);
        cor.setText("");


        Button wwww = (Button) findViewById(R.id.fff);
        wwww.setEnabled(true);
        Button iii = (Button) findViewById(R.id.tttt);
        iii.setEnabled(true);
        Button zzz = (Button) findViewById(R.id.zzz);
        zzz.setEnabled(true);
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
        if(n==4){
            if(ss.equals("dell")){
                cor.setText("✅");
                keys = keys + 3;
                Button key = (Button) findViewById(R.id.key);
                key.setText("      " + keys);
            }
            if(!(ss.equals("dell"))){
                cor.setText("❌");
            }
        }
    }

    public void previous(View view){
        Intent i = new Intent(this, gmail.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void next(View view){
        Intent i = new Intent(this, honda.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

}
