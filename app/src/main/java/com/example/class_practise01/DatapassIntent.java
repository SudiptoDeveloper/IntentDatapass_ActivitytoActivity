package com.example.class_practise01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DatapassIntent extends AppCompatActivity {

    EditText et;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapass_intent);

        et = findViewById(R.id.edit_text);
        btn_back = findViewById(R.id.button1);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = et.getText().toString().trim();
                Intent ii = new Intent();
                ii.putExtra("value", value);
                setResult(RESULT_OK, ii);
                finish();
            }
        });

    }
}