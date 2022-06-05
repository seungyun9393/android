package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SPActivity extends AppCompatActivity {

    SharedPreferences sharedPref;
    SharedPreferences.Editor sharedEditor;

    Button mySaveButton,myLoadButton;
    EditText myEditText;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        sharedPref = getSharedPreferences("test_pref", Context.MODE_PRIVATE);
        sharedEditor = sharedPref.edit();


        mySaveButton = findViewById(R.id.mySaveButton);
        myLoadButton = findViewById(R.id.myLoadButton);
        myEditText = findViewById(R.id.myEditText);
        myTextView = findViewById(R.id.myTextView);

        mySaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedEditor.putString(getString(R.string.sp_test), myEditText.getText().toString());
                sharedEditor.apply();

            }
        });

        myLoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = sharedPref.getString(getString(R.string.sp_test),"null");
                myTextView.setText(res);

            }
        });

    }
}
