package com.hussamaldouj.developdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class datastract extends AppCompatActivity {
    ImageView img;
    int[] stract=new int[]{R.drawable.stract1,R.drawable.stract2,R.drawable.stract3,R.drawable.stract4,R.drawable.stract5,R.drawable.stract6,
            R.drawable.stract7,R.drawable.stract8,R.drawable.stract9,R.drawable.stract10,R.drawable.stract11 };
    int index=0;
    private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastract);
        img=(ImageView)findViewById(R.id.imageVidatastract);
        img.setImageResource(stract[0]);
        viewFlipper=findViewById(R.id.viewfliblang);

    }

    public void btnnext(View view) {
        img.setImageResource(stract[index+1]);
        if(index<9)
            index++;
        viewFlipper.showNext();

    }
    public void btnprev(View view) {
        if(index>=0){
            img.setImageResource(stract[index]);
            index--;

        }
        viewFlipper.showPrevious();

    }
}

