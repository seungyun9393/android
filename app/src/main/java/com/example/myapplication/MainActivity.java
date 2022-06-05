package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText myEt,myEt2;
    TextView worldTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        worldTV = findViewById(R.id.worldTV);
        Button myBtn = findViewById(R.id.myBtn);
        myEt = findViewById(R.id.myEt);
        myEt2 = findViewById(R.id.myEt2);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int etString = Integer.parseInt(myEt.getText().toString());
                int et2String = Integer.parseInt(myEt2.getText().toString());
                int sum = etString+et2String;
                //Log.e("zzz",""+sum);
                worldTV.setText(""+sum);
            }
        });
    }
}