package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    ImageView iv;
    Button main3Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        iv= findViewById(R.id.myImage);
        main3Btn = findViewById(R.id.main3Btn);


        main3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageDrawable(getDrawable(R.drawable.my));

            }
        });

        int myint=getIntent().getExtras().getInt("my int");
        Log.e("my Tag", ""+myint);
    }
}
