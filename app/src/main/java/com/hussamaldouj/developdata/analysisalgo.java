package com.hussamaldouj.developdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class analysisalgo extends AppCompatActivity {
    ImageView img;
    int[] analysis=new int[]{R.drawable.analysis1,R.drawable.analysis2,R.drawable.analysis3,R.drawable.analysis4,R.drawable.analysis5,R.drawable.analysis6,
            R.drawable.analysis7,R.drawable.analysis8,R.drawable.analysis9,R.drawable.analysis10,R.drawable.analysis11,R.drawable.analysis12,R.drawable.analysis13
            ,R.drawable.analysis14,R.drawable.analysis15,R.drawable.analysis16,R.drawable.analysis17,R.drawable.analysis18,R.drawable.analysis19
            ,R.drawable.analysis20,R.drawable.analysis21,R.drawable.analysis22,R.drawable.analysis23,R.drawable.analysis24,R.drawable.analysis25
            ,R.drawable.analysis26,R.drawable.analysis27,R.drawable.analysis28,R.drawable.analysis29,R.drawable.analysis30,R.drawable.analysis31
            ,R.drawable.analysis32,R.drawable.analysis33 };
    int index=0;
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysisalgo);
        img=(ImageView)findViewById(R.id.imageViaanalysis);
        img.setImageResource(analysis[0]);
        viewFlipper=findViewById(R.id.viewfliblang);

    }   public void btnprev(View view) {
        if(index>=0){
            img.setImageResource(analysis[index]);
            index--;

        }
        viewFlipper.showPrevious();

    }

    public void btnnext(View view) {
        img.setImageResource(analysis[index+1]);
        if(index<31)
            index++;
        viewFlipper.showNext();

    }
}


