package com.example.wdfg12.cfoodcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.clarifai.api.ClarifaiClient;

public class RecognitionActivity extends AppCompatActivity {

    private static final String TAG = RecognitionActivity.class.getSimpleName();
    private static final int CODE_PICK = 1;

    private ImageView photoView;

    //Client ID and Secret to access the Clarifai Service. Blank in github pushed version.
    private final ClarifaiClient client = new ClarifaiClient("",
            "");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recognition);

        photoView = (ImageView) findViewById(R.id.photoView);
    }

    public void onClickBack(View v) {
        finish();
    }
}
