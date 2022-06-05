package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RabbitRoomActivity extends AppCompatActivity {

    Button backBtn;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit_room);
        iv = findViewById(R.id.roomIv);

        int rabbitCheck=getIntent().getExtras().getInt("rabbitCheck");
        backBtn = findViewById(R.id.backBtn);
        if(rabbitCheck ==1) {
            iv.setImageDrawable(getDrawable(R.drawable.rabbit));
        }

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
