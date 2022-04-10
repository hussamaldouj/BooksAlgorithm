package com.hussamaldouj.developdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class prog extends AppCompatActivity {
    ImageView img;
    int[] prog=new int[]{R.drawable.prog};
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);
        img=(ImageView)findViewById(R.id.imageViprog);
        img.setImageResource(prog[0]);
    }

    public void btnprev(View view) {
     //   img.setImageResource(prog[index]);
    //    if(index>0)
         //   index--;
    }

    public void btnnext(View view) {
      //  img.setImageResource(prog[index]);
       // if(index<0)
         //   index++;
    }
}