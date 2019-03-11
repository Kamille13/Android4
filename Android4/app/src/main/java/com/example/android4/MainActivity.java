package com.example.android4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit = findViewById(R.id.editLogin);


        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent testActivity = new Intent(MainActivity.this, testActivity.class);
                startActivity(testActivity);
                Toast.makeText(MainActivity.this, mEdit.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }



}
