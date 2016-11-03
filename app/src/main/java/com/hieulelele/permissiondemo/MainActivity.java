package com.hieulelele.permissiondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int CAMERA_REQUEST = 100;
    private Button mShowCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCamera = (Button) findViewById(R.id.mShowCamera);

        mShowCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //doi quyen truy cap camera
                //neu ko cap quyen camera se bi crash app
                //vao setting cap quyen hoac vao
                showCamera();
            }
        });
    }

    private void showCamera() {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }
}
