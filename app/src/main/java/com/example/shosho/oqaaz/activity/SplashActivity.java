package com.example.shosho.oqaaz.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shosho.oqaaz.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );
        Thread timer=new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intMainActivity=new Intent(SplashActivity.this,GettingStartedActivity.class);
                    startActivity(intMainActivity);
                    finish();
                }
            }
        };
        timer.start();

    }
}

