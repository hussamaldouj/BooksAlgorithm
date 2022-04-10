package com.hussamaldouj.developdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class lang extends AppCompatActivity {
ImageView img;
     int[] lang=new int[]{R.drawable.lang1,R.drawable.lang2,R.drawable.lang3,R.drawable.lang4 };
     int index=0;
     private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang);
        img=(ImageView)findViewById(R.id.imageVilang);
        img.setImageResource(lang[0]);
        viewFlipper=findViewById(R.id.viewfliblang);
    }

    public void btnprev(View view) {
        if(index>=0){
            img.setImageResource(lang[index]);
            index--;

        }
        viewFlipper.showPrevious();
    }

    public void btnnext(View view) {
        img.setImageResource(lang[index+1]);
        if(index<2)
            index++;
        viewFlipper.showNext();
    }
}
