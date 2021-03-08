package com.example.omar_midterm21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}

    String[] attraction = {"Art Institute of Chicago",
            "pic1","Pic2","Pic3","Pic4"};
    setListAdapter(new ArrayAdapter<String>(this, R.layout.thirdactivity,
                   R.id.thirdactivity, attraction));
        }
protected void onListItemClick(ListView l, View v, int position, long
        id){
        switch(position){
        case 0:
        startActivity(new Intent(Intent.ACTION_VIEW,
        Uri.parse("http://alfaisal.edu")));
        break;
        case 1:
        startActivity(new Intent(Intent.ACTION_VIEW,

        break;
        case 2:
        startActivity(new
        Intent(MainActivity.this,PicActivity.class));
        break; }}