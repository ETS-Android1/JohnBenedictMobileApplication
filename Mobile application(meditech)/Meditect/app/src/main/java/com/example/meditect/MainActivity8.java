package com.example.meditect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void toAvatar (View view)
    {
        Intent intent = new Intent (MainActivity8.this, MainActivity3.class); startActivity(intent);
    }
    public void chooseDoctor (View view)
    {
        Intent intent = new Intent (MainActivity8.this, MainActivity9.class); startActivity(intent);
    }
}