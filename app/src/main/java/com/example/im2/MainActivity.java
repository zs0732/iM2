package com.example.im2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton iM;
    ImageView iV;
    int num;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iV = (ImageView) findViewById(R.id.iV);
        iM = (ImageButton) findViewById(R.id.iM);
    }

    public void clicked(View view) {
        num = rnd.nextInt(3)+1;
        if(num==1){
            iM.setImageResource(R.drawable.one);
            iV.setImageResource(R.drawable.da);
        }
        if(num==2){
            iM.setImageResource(R.drawable.two);
            iV.setImageResource(R.drawable.db);
        }
        if(num==3){
            iM.setImageResource(R.drawable.three);
            iV.setImageResource(R.drawable.dc);
        }
    }
}