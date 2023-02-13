package com.example.fisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText massIn;
    private Button btnWeight;
    private EditText Result;

    private String mass = "";
    Algorithm algorithm = new Algorithm();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        massIn = findViewById(R.id.massIn);
        btnWeight = findViewById(R.id.btnWeight);
        Result = findViewById(R.id.Result);

        btnWeight.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mass = massIn.getText().toString();
            Result.setText("Необходимо"  + algorithm.absoluteWeightCalculation(mass) +  "кг топлива");

        }
    };
}