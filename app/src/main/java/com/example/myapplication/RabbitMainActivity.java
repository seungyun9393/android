package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RabbitMainActivity extends AppCompatActivity {

    int random,score,trynum;
    Button Btn1,Btn2,Btn3;
    TextView ScoreTV,TryTV;
    ImageView RoomIv;

    @Override
    protected void onResume() {
        super.onResume();

        if(score >=3 || trynum == 0) {
            finish();
        }


        random = (int)((Math.random() * 10)/4);
        ScoreTV.setText(""+score);
        TryTV.setText(""+trynum);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit_main);

        Btn1 = findViewById(R.id.FirstRoomBtn);
        Btn2 = findViewById(R.id.SecondRoomBtn);
        Btn3 = findViewById(R.id.ThirdRoomBtn);

        ScoreTV = findViewById(R.id.ScoreTV);
        TryTV = findViewById(R.id.TryTV);
        RoomIv = findViewById(R.id.roomIv);

        score=0;
        trynum=5;


        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Btn1num=0;
                trynum--;
                Intent intent = new Intent(getApplicationContext(),RabbitRoomActivity.class);
                if(random == Btn1num) {
                    intent.putExtra("rabbitCheck", 1);
                    score++;
                } else {
                    intent.putExtra("rabbitCheck", 0);
                }
                startActivity(intent);
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Btn2num=1;
                trynum--;
                Intent intent = new Intent(getApplicationContext(),RabbitRoomActivity.class);
                if(random == Btn2num) {
                    intent.putExtra("rabbitCheck", 1);
                    score++;
                } else {
                    intent.putExtra("rabbitCheck", 0);
                }
                startActivity(intent);

            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Btn3num=2;
                trynum--;
                Intent intent = new Intent(getApplicationContext(),RabbitRoomActivity.class);
                if(random == Btn3num) {
                    intent.putExtra("rabbitCheck", 1);
                    score++;
                } else {
                    intent.putExtra("rabbitCheck", 0);
                }
                startActivity(intent);

            }
        });

    }
}
