package com.nepsian.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("Calling from Activity:", "onCreate----LifeCycle");

        Button btn = findViewById(R.id.clickMeButton);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Button has been clicked!!!!!", Snackbar.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(), "Button has been clicked!!!!!", Toast.LENGTH_LONG).show();

            }
        });
    }
}