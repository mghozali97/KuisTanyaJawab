package com.example.kuistanyajawab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    RadioGroup radiogr1,radiogr2,radiogr3,radiogr4,radiogr5;
    Button Proses;
    RadioButton value_no1,value_no2,value_no3,value_no4,value_no5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogr1 = findViewById(R.id.radiogroup1);
        radiogr2 = findViewById(R.id.radiogroup2);
        radiogr3 = findViewById(R.id.radiogroup3);
        radiogr4 = findViewById(R.id.radiogroup4);
        radiogr5 = findViewById(R.id.radiogroup5);

        Proses = findViewById(R.id.proses);
        Proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int pointa = radiogr1.getCheckedRadioButtonId();
                value_no1 = findViewById(pointa);

                int pointb = radiogr2.getCheckedRadioButtonId();
                value_no2 = findViewById(pointb);

                int pointc = radiogr3.getCheckedRadioButtonId();
                value_no3 = findViewById(pointc);

                int pointd = radiogr4.getCheckedRadioButtonId();
                value_no4 = findViewById(pointd);

                int pointe = radiogr5.getCheckedRadioButtonId();
                value_no5 = findViewById(pointe);

                int nilai = 0; // variabel untuk menampung nilai

                if(value_no1.getText().toString().toLowerCase().equals("php")){
                    nilai = nilai + 20;
                }
                if(value_no2.getText().toString().toLowerCase().equals("control panel")){
                    nilai = nilai + 20;
                }
                if(value_no3.getText().toString().toLowerCase().equals("hypertext preprocessor")){
                    nilai = nilai + 20;
                }
                if(value_no4.getText().toString().toLowerCase().equals("hardisk")){
                    nilai = nilai + 20;
                }
                if(value_no5.getText().toString().toLowerCase().equals("menampilkan data")){
                    nilai = nilai + 20;
                }

                Intent j = new Intent(MainActivity.this, ResultActivity.class);
                j.putExtra("nilai",nilai);
                startActivity(j);
                finish();
            }
        });
    }
}

