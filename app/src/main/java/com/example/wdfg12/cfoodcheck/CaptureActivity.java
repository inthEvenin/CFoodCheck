package com.example.wdfg12.cfoodcheck;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CaptureActivity extends AppCompatActivity {
    Button captureButton;
    ImageView capturedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);

        capturedImage = (ImageView) findViewById(R.id.capturedImage);
        captureButton = (Button) findViewById(R.id.captureButton);

        captureButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        capturedImage.setImageURI(data.getData());
    }
}
