package com.example.convenientconverters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class FarenheitToCelsiusConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farenheit_to_celsius_converter);
    }


    public void onClick(View v){
        switch (v.getId()){
            case R.id.Calculate:
                convertDegrees();
                break;
            case R.id.Clear:
                clear();
                break;
        }

    }


    private void convertDegrees(){
        EditText farenheitText = findViewById(R.id.fText);
        EditText celsiusText = findViewById(R.id.cText);
        if(!farenheitText.getText().toString().matches("")){
            Double farenheit = Double.parseDouble(farenheitText.getText().toString());
            Double celsius = (farenheit - 32) * 5/9;

            celsiusText.setText(String.format("%.2f", celsius));
        }
        else if(!celsiusText.getText().toString().matches("")){
            Double celsius = Double.parseDouble(celsiusText.getText().toString());
            Double farenheit = ((celsius * 1.8) + 32);

            farenheitText.setText(String.format("%.2f", farenheit));
        }
    }

    private void clear(){
        EditText farenheitText = findViewById(R.id.fText);
        EditText celsiusText = findViewById(R.id.cText);
        farenheitText.setText("");
        celsiusText.setText("");
    }



}
