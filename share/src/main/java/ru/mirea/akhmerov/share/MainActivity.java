package ru.mirea.akhmerov.share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//        Intent intent = new Intent(Intent.ACTION_PICK);
//        intent.setType("*/*");
//        startActivityForResult(intent,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_TEXT,"Mirea");
        startActivity(Intent.createChooser(intent,"Выбор за вами!"));
    }
}