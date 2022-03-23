package com.example.meditect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }


double quantity1 = 0;
double quantity2 = 0;
double quantity3 = 0;

    public void increment1(View view) {

        quantity1 = quantity1 + 1;

        display(quantity1);

    }

    public void increment2(View view) {

        quantity2 = quantity2 + 1;

        display2(quantity2);

    }
    public void increment3(View view) {

        quantity3 = quantity3 + 1;

        display3(quantity3);

    }
    public void decrement1(View view) {

        quantity1 = quantity1 - 1;

        display(quantity1);

    }
    public void decrement2(View view) {

        quantity2 = quantity2 - 1;

        display2(quantity2);

    }
    public void decrement3(View view) {

        quantity3 = quantity3 - 1;

        display3(quantity3);

    }

    private void display(double number) {

        TextView quantityTextView = (TextView) findViewById(

                R.id.quantity_text_view);

        quantityTextView.setText("" + number);

    }
    private void display2(double number) {

        TextView quantityTextView = (TextView) findViewById(

                R.id.quantity_text_view3);

        quantityTextView.setText("" + number);


    }

    private void display3(double number) {

        TextView quantityTextView = (TextView) findViewById(

                R.id.quantity_text_view5);

        quantityTextView.setText("" + number);


    }





    public void calcbmi (View view)
    {
        display (quantity1);
        displaybmi (quantity3 / (((quantity1 * (0.3048)) + (quantity2 * (0.0254)))*((quantity1 * (0.3048)) + (quantity2 * (0.0254)))));
    }

    private void displaybmi (double number)
    {
        TextView bmiTextView = (TextView) findViewById(R.id.textView10);
        bmiTextView.setText("" + number);
    }

    public void symptomsSummary (View view)
    {
        Intent intent = new Intent (MainActivity5.this, MainActivity8.class); startActivity(intent);
    }
}


