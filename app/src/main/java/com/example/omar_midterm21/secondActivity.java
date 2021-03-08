package com.example.omar_midterm21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Calendar;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
    Button donebttn = (Button)findViewById(R.id.button3);
    final RadioButton rd1 = (RadioButton)findViewById(R.id.radioButton);
    final RadioButton rd2 = (RadioButton)findViewById(R.id.radioButton2);
    final RadioButton rd3 = (RadioButton)findViewById(R.id.radioButton3);
    final RadioButton rd4 = (RadioButton)findViewById(R.id.radioButton4);
    Button bttn2 = (Button)findViewById(R.id.button2);
bttn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        startActivity(new Intent(secondActivity.this,thirdactivity.class));

        }
        });

    Button donebttn = (Button)findViewById(R.id.button3);
    final RadioButton rd1 = (RadioButton)findViewById(R.id.radioButton);
    final RadioButton rd2 = (RadioButton)findViewById(R.id.radioButton2);
    final RadioButton rd3 = (RadioButton)findViewById(R.id.radioButton3);
    final RadioButton rd4 = (RadioButton)findViewById(R.id.radioButton4);
donebttn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {


        if(rd1.IsChecked){
        Toast.makeText(MainActivity.this,"Hi Mr"+editTextTextPersonName,Toast.LENGTH_LONG).show();
        }
        }
       else if(rd2.IsChecked){
        Toast.makeText(MainActivity.this,"Hi Ms"+editTextTextPersonName,Toast.LENGTH_LONG).show();
        }
        }
        if(rd1.IsChecked || rd2.IsChecked && rd4){
        Toast.makeText(MainActivity.this,"Hi Prof"+editTextTextPersonName,Toast.LENGTH_LONG).show();
        }
        }
        }






