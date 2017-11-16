package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private String forecast;
    private TextView weatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        weatherTextView = (TextView) findViewById(R.id.weather_textview);

        Intent intent = getIntent();

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        if (intent != null) {
            if (intent.hasExtra(Intent.EXTRA_TEXT)) {
                forecast = intent.getStringExtra(Intent.EXTRA_TEXT);
                weatherTextView.setText(forecast);
            }
        }
    }
}