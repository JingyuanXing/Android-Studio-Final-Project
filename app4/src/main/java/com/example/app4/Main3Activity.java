package com.example.app4;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void SwitchFragment(View view){
        Fragment fragment;

        if(view == findViewById(R.id.button)) {
            fragment = new fragmentOne();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_replace, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.button2)){
            fragment = new fragmentTwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_replace, fragment);
            ft.commit();
        }
    }
}
