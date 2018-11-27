package com.example.shosho.oqaaz.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shosho.oqaaz.R;

public class LoginActivity extends AppCompatActivity {
    TextView registerHere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        registerHere=findViewById( R.id.login_text_register_here );

        registerHere.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( LoginActivity.this,RegisterActivity.class );
                startActivity( intent );
            }
        } );
    }
}
