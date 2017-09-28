package com.example.theopsyphertxt.ribbit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calls the login screen immediately after creating the main canvas
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}

//tabs with wipes needed