package com.cx.testndkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnTestNDK;
    static {
        System.loadLibrary("hello");
    }

    public static native String helloWorld();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTestNDK = (Button) findViewById(R.id.btn_testNDK);
        btnTestNDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,helloWorld(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
