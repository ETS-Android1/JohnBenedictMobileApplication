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

public class MainActivity6 extends AppCompatActivity {
    Button bttn_cam2;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        bttn_cam2 = (Button) findViewById(R.id.bttn_cam2);
        iv = (ImageView) findViewById(R.id.imageView9);
        bttn_cam2.setOnClickListener(new View.OnClickListener() {
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
        Intent intent = new Intent (MainActivity6.this, MainActivity3.class); startActivity(intent);
    }
    public void healthhistory (View view)
    {
        Intent intent = new Intent (MainActivity6.this, MainActivity5.class); startActivity(intent);
    }
}