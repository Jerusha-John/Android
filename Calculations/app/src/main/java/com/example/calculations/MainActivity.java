package com.example.calculations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onPlus(View v) {
        EditText e1,e2,e3;
        e1 = (EditText)findViewById(R.id.et1);
        e2 = (EditText)findViewById(R.id.et2);
        e3 = (EditText)findViewById(R.id.et3);
        String str1 = Integer.parseInt(e1.getText().toString());
        String str2 = e2.getText().toString();
        int res =

    }
}