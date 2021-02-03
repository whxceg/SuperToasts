package com.github.johnpersano.supertoasts.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.johnpersano.supertoasts.SuperActivityToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuperActivityToast.create(MainActivity.this,"Toast", Toast.LENGTH_SHORT).show();
            }
        });
    }
}