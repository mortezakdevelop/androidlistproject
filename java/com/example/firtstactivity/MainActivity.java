package com.example.firtstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.implicit).setOnClickListener(V->{

        });
        findViewById(R.id.explicit).setOnClickListener(V->{
            Intent intent = new Intent(MainActivity.this,TestActivity.class);
            startActivity(intent);
        });
    }

}