package com.example.meditect;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

 public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
     public void toEyes (View view)
     {
         Intent intent = new Intent (MainActivity3.this, MainActivity4.class); startActivity(intent);
     }

     public void stomach (View view)
     {
         Intent intent = new Intent (MainActivity3.this, MainActivity6.class); startActivity(intent);
     }

     public void genitalia (View view)
     {
         Intent intent = new Intent (MainActivity3.this, MainActivity7.class); startActivity(intent);
     }
}