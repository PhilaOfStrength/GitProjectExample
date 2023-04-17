package com.example.statsapp;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Double> numbers = new ArrayList<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doAdd(View v){

        EditText input = (EditText)findViewById(R.id.editText1);
        String value = input.getText().toString();
        Double d = Double.parseDouble(value);
        numbers.add(d);
        input.setText("");
    }
    public void doMean(View v){

        double mean = Calculator.getMean(numbers);
        TextView ans = (TextView)findViewById(R.id.output);
        ans.setText(Double.toString(mean));

    }
    public void doVariance(View v) {

        double variance = Calculator.getVariance(numbers);
        TextView ans = (TextView)findViewById(R.id.output);
        ans.setText(Double.toString(variance));
    }

    public void doStdDev(View v) {

        double std = Calculator.getStdDev(numbers);
        TextView ans = (TextView)findViewById(R.id.output);
        ans.setText(Double.toString(std));
    }
}