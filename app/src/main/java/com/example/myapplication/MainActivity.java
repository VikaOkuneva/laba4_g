package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView calculator;
    private EditText number2, number1;
    private Button plus, minus, umnoz, razdel, AC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        calculator = findViewById(R.id.calculator);
        number2 = findViewById(R.id.number2);
        number1 = findViewById(R.id.number1);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        umnoz = findViewById(R.id.umnoz);
        razdel = findViewById(R.id.razdel);
        AC = findViewById(R.id.AC);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                float res = num1 + num2;
                  
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                float res = num1 - num2;
                calculator.setText(String.valueOf(res));
            }
        });

        umnoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                float res = num1 * num2;
                calculator.setText(String.valueOf(res));
            }
        });

        razdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                float res = num1 / num2;
                calculator.setText(String.valueOf(res));
            }
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                number1.setText("");
                number2.setText("");
            }
        });
    }
    public void nextAbout(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}