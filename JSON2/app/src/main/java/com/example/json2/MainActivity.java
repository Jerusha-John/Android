package com.example.json2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output = (TextView) findViewById(R.id.textView1);

        String strJson = "{\"Employee\" :[{\"id\":\"101\",\"name\":\"Sonoo Jiaswal\",\"salary\":\"50000\"},{\"id\":\"102\",\"name\":\"Vimal Jaiswal\",\"salary\":\"60000\"}]}";
        String data = "";

        try{
           JSONObject jsonRootObject = new JSONObject(strJson);
           JSONArray jsonArray = jsonRootObject.optJSONArray("Employee");
           for(int i=0;i<jsonArray.length();i++){
               JSONObject jsonObject = jsonArray.getJSONObject(i);
               int id = Integer.parseInt(jsonObject.optString("id").toString());
               String name = jsonObject.optString("name").toString();
               float salary = Float.parseFloat(jsonObject.optString("salary").toString());
               data += "Node"+i+" : \n id = "+ id +" \n Name = "+ name +" \n Salary = "+ salary +" \n ";
               output.setText(data);
           }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}