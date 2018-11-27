package com.example.shosho.oqaaz.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shosho.oqaaz.R;

public class GettingStartedActivity extends AppCompatActivity {
TextView appName;
Button gettingStarted;
TextView loginHere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_getting_started );
        appName=findViewById( R.id.getting_started_name );
        gettingStarted=findViewById( R.id.getting_started_btn_start );
         loginHere=findViewById( R.id.getting_started_login_here );

        appName.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( GettingStartedActivity.this,NavigationActivity.class );
                startActivity( intent );
            }
        } );
        
        gettingStarted.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( GettingStartedActivity.this,ViewPagerActivity.class );
                startActivity( intent );
            }
        } );
        loginHere.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( GettingStartedActivity.this,LoginActivity.class );
                startActivity( intent );
            }
        } );
    }
}
