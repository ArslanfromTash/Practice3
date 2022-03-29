package ru.mirea.akhmerov.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

public class SimpleFragment extends AppCompatActivity {
    Fragment fragment1,fragment2;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fragment);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
    }

    @SuppressLint("NonConstantResourceId")
    public void onCLick(View view) {
        fragmentManager = getSupportFragmentManager();
        switch (view.getId()){
            case R.id.btnFragment1:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment1).commit();
                break;
            case R.id.btnFragment2:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment2).commit();
                break;
            default:
                break;
        }
    }
}