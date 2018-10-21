package com.example.black_lotus.practical2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendActivity(View view) {
        Log.d(LOG_TAG, "Button has been clicked!");
        Intent intent = new Intent(this, Receive.class);
        startActivity(intent);
    }

}
