package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_decrement:
                break;
            case R.id.bt_increment:
                break;
        }
    }
}
