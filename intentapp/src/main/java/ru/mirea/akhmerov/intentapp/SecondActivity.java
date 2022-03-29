package ru.mirea.akhmerov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textView = (TextView) findViewById(R.id.textView);
        String date = getIntent().getStringExtra("date");
        textView.setText(date);
    }
}