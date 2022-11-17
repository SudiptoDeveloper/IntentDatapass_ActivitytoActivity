package com.example.class_practise01;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Datapass1stTo2nd extends AppCompatActivity {

    private final static int MY_REQUEST_CODE = 1;

    TextView tv;
    Button btn_go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapass1st_to2nd);

        tv = findViewById(R.id.text_view);
        btn_go = findViewById(R.id.button);

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii = new Intent(Datapass1stTo2nd.this, DatapassIntent.class);
                startActivityForResult(ii, MY_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == MY_REQUEST_CODE) {
                if (data != null)
                    tv.setText(data.getStringExtra("value"));
            }
        }
    }
}