package com.cx.androidjnidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnNdk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNdk = (Button) findViewById(R.id.btn_ndk);

        btnNdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=helloWorld();
                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String helloWorld();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("hello");
    }
}
