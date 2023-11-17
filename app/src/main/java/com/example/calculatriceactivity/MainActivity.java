package com.example.calculatriceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView plus,muns,multiplication,equal,div,suprim,b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_cama,ecran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.b_plus);
        muns = findViewById(R.id.b_muns);
        multiplication= findViewById(R.id.b_multipl);
        equal = findViewById(R.id.b_equal);
        div = findViewById(R.id.div);
        suprim = findViewById(R.id.ac);
        b_0 = findViewById(R.id.b_0);
        b_1 = findViewById(R.id.b_1);
        b_2 = findViewById(R.id.b_2);
        b_3 = findViewById(R.id.b_3);
        b_5 = findViewById(R.id.b_5);
        b_4 = findViewById(R.id.b_4);
        b_6 = findViewById(R.id.b_6);
        b_7 = findViewById(R.id.b_7);
        b_8 = findViewById(R.id.b_8);
        b_9 = findViewById(R.id.b_9);
        b_cama = findViewById(R.id.b_point);
        ecran = findViewById(R.id.qw);
        

    }
}