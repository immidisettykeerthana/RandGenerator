package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.RandButton);
        tv=findViewById(R.id.answer);
    }

    public void generator(View view) {
        Random r = new Random();
        int low = 0;
        int high = 101;
        int result = r.nextInt(high-low) + low;
        String answerString = String.valueOf(result);
        tv.setText("Generated Random Number is : " + answerString);
    }
}