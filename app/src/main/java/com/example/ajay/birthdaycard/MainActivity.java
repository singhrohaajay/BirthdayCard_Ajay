package com.example.ajay.birthdaycard;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView images[] = new ImageView[12];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Display display = getWindowManager(). getDefaultDisplay();
        Point size = new Point();
        display. getSize(size);
        int width = size. x;

        width=width/2;


        images[0] = findViewById(R.id.i1);
        images[1] = findViewById(R.id.i2);
        images[2] = findViewById(R.id.i3);
        images[3] = findViewById(R.id.i4);
        images[4] = findViewById(R.id.i5);
        images[5] = findViewById(R.id.i6);
        images[6] = findViewById(R.id.i7);
        images[7] = findViewById(R.id.i8);
        images[8] = findViewById(R.id.i9);
        images[9] = findViewById(R.id.i10);
        images[10] = findViewById(R.id.i11);
        images[11] = findViewById(R.id.i12);

        for (int i = 0; i < 12; i++) {
            images[i].setOnClickListener(this);
            images[i].setMaxWidth(width);
            images[i].setMaxHeight(width);
        }

    }

    @Override
    public void onClick(View v) {



        Bitmap bmp =null;
        Intent intent=new Intent(MainActivity.this,send.class);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();


        switch (v.getId()) {
            case R.id.i1:
                 bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img1);
                break;
            case R.id.i2:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img2);

                break;
            case R.id.i3:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img3);

                break;
            case R.id.i4:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img4);
                 break;
            case R.id.i5:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img5);
                break;
            case R.id.i6:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img6);
                break;
            case R.id.i7:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img7);
                break;
            case R.id.i8:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img8);
                break;
            case R.id.i9:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img9);
                break;
            case R.id.i10:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img10);
                break;
            case R.id.i11:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img11);
                break;
            case R.id.i12:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img12);
                break;




        }
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] byteArray = stream.toByteArray();


        intent.putExtra("picture", byteArray);
        startActivity(intent);
    }
}
