package com.example.practial25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.img);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_logo);
                Toast.makeText(getApplicationContext(),"Rotating image",Toast.LENGTH_SHORT).show();
                img.startAnimation(anim);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_logo);
                Toast.makeText(getApplicationContext(),"Zooming image",Toast.LENGTH_SHORT).show();
                img.startAnimation(anim);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_logo);
                Toast.makeText(getApplicationContext(),"Fade image",Toast.LENGTH_SHORT).show();

                img.startAnimation(anim);
            }
        });

    }
}