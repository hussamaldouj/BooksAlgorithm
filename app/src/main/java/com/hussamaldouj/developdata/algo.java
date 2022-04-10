package com.hussamaldouj.developdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;

public class algo extends AppCompatActivity {
    ImageView img;
    int[] algo=new int[]{R.drawable.algo1,R.drawable.algo2,R.drawable.algo3,R.drawable.algo4,R.drawable.algo5,R.drawable.algo6,
            R.drawable.algo7,R.drawable.algo8,R.drawable.alg9,R.drawable.algo10 };
    int index=0;
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo);
        img=(ImageView)findViewById(R.id.imageVialgo);
        img.setImageResource(algo[0]);
        viewFlipper=findViewById(R.id.viewfliblang);

    }

    public void btnnext(View view) {
        img.setImageResource(algo[index+1]);
        if(index<8)
        index++;
        viewFlipper.showNext();

    }
    public void btnprev(View view) {
        if(index>=0){
            img.setImageResource(algo[index]);
            index--;

        }
        viewFlipper.showPrevious();

    }
}
