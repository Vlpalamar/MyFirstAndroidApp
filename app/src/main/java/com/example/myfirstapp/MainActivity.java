package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button clickMe_button;
    private static final String TAG = "MyFirstApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickMe_button= findViewById(R.id.clickMe_button);
        clickMe_button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Log.i(TAG, "button 'clickMe_button' was pressed");
            }
        });
        Log.i(TAG, "App Created"+" "+ System.currentTimeMillis());
    }

    @Override
    protected  void onStart() {

        super.onStart();
        Log.i(TAG, "App started"+" "+ System.currentTimeMillis());
    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "App Paused"+" "+ System.currentTimeMillis());

    }

    @Override
    protected  void  onStop() {

        super.onStop();
        Log.i(TAG, "App Stop"+" "+ System.currentTimeMillis());
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "App Resume"+" "+ System.currentTimeMillis());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "App Destroyed"+" "+ System.currentTimeMillis());
    }


}