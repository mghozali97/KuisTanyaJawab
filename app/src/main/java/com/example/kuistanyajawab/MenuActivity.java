package com.example.kuistanyajawab;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MenuActivity extends AppCompatActivity {
    Button btnexit,teknologi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        teknologi = (Button) findViewById(R.id.teknologi);
        btnexit = (Button) findViewById(R.id.btnexit);


        teknologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                MenuActivity.this.startActivity(intent);
            }


        });


        {
            btnexit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //perintah untuk mengakhiri aplikasi
                    finish();
                }
            });
        }
    }
}