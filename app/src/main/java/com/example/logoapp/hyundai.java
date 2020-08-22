package com.example.logoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hyundai extends AppCompatActivity {

    public int keys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyundai);

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

    public void t(View view) {
        TextView text = (TextView) findViewById(R.id.text);
        ss += "n";
        text.setText(ss);
        correct();
        Button ttt = (Button) findViewById(R.id.fff);
        ttt.setEnabled(false);
    }

    public void r(View view) {
        TextView text = (TextView) findViewById(R.id.text);
        ss += "r";
        text.setText(ss);
        correct();
        Button rrr = (Button) findViewById(R.id.rrr);
        rrr.setEnabled(false);
    }

    public void k(View view) {
        TextView text = (TextView) findViewById(R.id.text);
        ss += "k";
        text.setText(ss);
        correct();
        Button ttt = (Button) findViewById(R.id.kkk);
        ttt.setEnabled(false);
    }

    public void ww(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="d";
        text.setText(ss);
        correct();
        Button www = (Button) findViewById(R.id.www);
        www.setEnabled(false);
    }

    public void tt(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="t";
        text.setText(ss);
        correct();
        Button tttt = (Button) findViewById(R.id.tttt);
        tttt.setEnabled(false);
    }

    public void z(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="z";
        text.setText(ss);
        correct();
        Button zzz = (Button) findViewById(R.id.zzz);
        zzz.setEnabled(false);
    }

    public void ttt(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="h";
        text.setText(ss);
        correct();
        Button ooo = (Button) findViewById(R.id.ttttt);
        ooo.setEnabled(false);
    }

    public void s(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="a";
        text.setText(ss);
        correct();
        Button sss = (Button) findViewById(R.id.sss);
        sss.setEnabled(false);
    }

    public void c(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="y";
        text.setText(ss);
        correct();
        Button ccc = (Button) findViewById(R.id.lll);
        ccc.setEnabled(false);
    }

    public void p(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="u";
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

    public void i(View view){
        TextView text = (TextView) findViewById(R.id.text);
        ss+="i";
        text.setText(ss);
        correct();
        Button iii = (Button) findViewById(R.id.iii);
        iii.setEnabled(false);
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
        Button rrr = (Button) findViewById(R.id.rrr);
        rrr.setEnabled(true);
        Button kkk = (Button) findViewById(R.id.kkk);
        kkk.setEnabled(true);
    }

    public void correct(){
        n++;
        Button cor = (Button) findViewById(R.id.correct);
        cor.setText("");
        if(n==7){
            if(ss.equals("hyundai")){
                cor.setText("✅");
                keys = keys + 3;
                Button key = (Button) findViewById(R.id.key);
                key.setText("      " + keys);
            }
            if(!(ss.equals("hyundai"))){
                cor.setText("❌");
            }
        }
    }

    public void previous(View view){
        Intent i = new Intent(this, predator.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

    public void next(View view){
        Intent i = new Intent(this, blackberry.class);
        i.putExtra("firstMessage",keys);
        startActivity(i);
    }

}
