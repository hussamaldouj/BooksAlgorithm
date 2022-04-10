package com.hussamaldouj.developdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class linealgo extends AppCompatActivity {
    ImageView img;
    int[] linealgo=new int[]{R.drawable.linealgo1,R.drawable.linealgo2,R.drawable.linealgo3,R.drawable.linealgo4,R.drawable.linealgo5,R.drawable.linealgo6,
            R.drawable.linealgo7,R.drawable.linealgo8,R.drawable.linealgo9,R.drawable.linealgo10,R.drawable.linealgo11 };
    int index=0;
    private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linealgo);
        img=(ImageView)findViewById(R.id.imageVialinealgo);
        img.setImageResource(linealgo[0]);
        viewFlipper=findViewById(R.id.viewfliblang);
    }

    public void btnnext(View view) {
        img.setImageResource(linealgo[index+1]);
        if(index<9)
            index++;
        viewFlipper.showNext();
    }

    public void btnprev(View view) {
        if(index>=0){
            img.setImageResource(linealgo[index]);
            index--;

        }
        viewFlipper.showPrevious();
    }
}
