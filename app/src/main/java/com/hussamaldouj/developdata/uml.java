package com.hussamaldouj.developdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class uml extends AppCompatActivity {
    ImageView img;
    int[] uml=new int[]{R.drawable.uml1,R.drawable.uml2,R.drawable.uml3,R.drawable.uml4,R.drawable.uml5,R.drawable.uml6,
            R.drawable.uml7,R.drawable.uml8,R.drawable.uml9,R.drawable.uml10,R.drawable.uml11,R.drawable.uml12,R.drawable.uml13
            ,R.drawable.uml14,R.drawable.uml15,R.drawable.uml16,R.drawable.uml17,R.drawable.uml18,R.drawable.uml19
            ,R.drawable.uml20,R.drawable.uml21,R.drawable.uml22,R.drawable.uml23,R.drawable.uml24,R.drawable.uml25
            ,R.drawable.uml26,R.drawable.uml27,R.drawable.uml28,R.drawable.uml29,R.drawable.uml30,R.drawable.uml31
            ,R.drawable.uml32,R.drawable.uml33,R.drawable.uml34,R.drawable.uml35,R.drawable.uml36,R.drawable.uml37};
    int index=0;
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uml);
        img=(ImageView)findViewById(R.id.imageViuml);
        img.setImageResource(uml[0]);
        viewFlipper=findViewById(R.id.viewfliblang);


    }
    public void btnprev(View view) {
        if(index>=0){
            img.setImageResource(uml[index]);
            index--;

        }
        viewFlipper.showPrevious();

    }

    public void btnnext(View view) {
        img.setImageResource(uml[index+1]);
        if(index<35)
            index++;
        viewFlipper.showNext();

    }
}
