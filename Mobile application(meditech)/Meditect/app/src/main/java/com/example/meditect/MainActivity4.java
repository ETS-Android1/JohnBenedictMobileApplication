package com.example.meditect;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity4 extends AppCompatActivity {
    Button bttn_cam;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        bttn_cam = (Button) findViewById(R.id.bttn_cam);
        iv = (ImageView) findViewById(R.id.imageView);
        bttn_cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras ().get("data"); iv.setImageBitmap(bitmap);

    }


    public void toAvatar (View view)
    {
        Intent intent = new Intent (MainActivity4.this, MainActivity3.class); startActivity(intent);
    }
    public void healthhistory (View view)
    {
        Intent intent = new Intent (MainActivity4.this, MainActivity5.class); startActivity(intent);
    }
}