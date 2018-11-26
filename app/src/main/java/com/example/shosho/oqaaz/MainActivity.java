package com.example.shosho.oqaaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shosho.oqaaz.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        getSupportFragmentManager().beginTransaction().replace( R.id.main_frame_container,new LoginFragment() ).commit();
    }
}
