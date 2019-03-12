package com.example.convenientconverters;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }


    public void onClick(View v){
        switch (v.getId()){
            case R.id.ConversionButton:
                calculateEachPerson();
                break;
            case R.id.Clear:
                clear();
                break;
        }
    }


    private void calculateEachPerson(){
        EditText totalText = findViewById(R.id.totalBill);
        EditText percentText = findViewById(R.id.tipPercentage);
        EditText peopleText = findViewById(R.id.numberOfPeople);
        TextView message = findViewById(R.id.Message);

        if(!totalText.getText().toString().matches("") || percentText.getText().toString().matches("") || peopleText.getText().toString().matches("")){
            Double bill = Double.parseDouble(totalText.getText().toString());
            Double tip = calculateTip(Double.parseDouble(percentText.getText().toString()), bill);
            Double people = Double.parseDouble(peopleText.getText().toString());
            Double eachPerson = (bill / people) + (tip / people);
        }
    }

    private double calculateTip(Double percent, Double bill){
        if(percent % 1 != 0){
            return percent * bill;
        }
        else{
            return (percent / 100) * bill;
        }
    }

    private void clear(){
        EditText totalText = findViewById(R.id.totalBill);
        EditText percentText = findViewById(R.id.tipPercentage);
        EditText peopleText = findViewById(R.id.numberOfPeople);
        TextView message = findViewById(R.id.Message);

        totalText.setText("");
        percentText.setText("");
        peopleText.setText("");
        message.setText("");
    }



}
