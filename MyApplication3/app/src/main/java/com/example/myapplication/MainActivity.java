package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText mEdit;
    EditText mEdit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit = findViewById(R.id.editText);
        mEdit2 = findViewById(R.id.editText2);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("My App", "Congratulation ");
                Toast.makeText(getApplicationContext(), "Congratulation " + mEdit.getText().toString() + " " + mEdit2.getText().toString(), Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }
}

