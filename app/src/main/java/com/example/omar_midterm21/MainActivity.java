package com.example.omar_midterm21;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends Activity {
    protected int _splashTime = 5000;

    private Thread splashTread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized(this){
                        wait(_splashTime);
                    }

                } catch(InterruptedException e) {}
                finally {
                    finish();

                    Intent i = new Intent();
                    i.setClass(MainActivity.this, secondActivity.class);
                    startActivity(i);

                    //stop();
                }
            }
        };

        splashTread.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

    Button gotobttn = (Button)findViewById(R.id.button);
bttn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,secondactivity.class));
        }
        });
