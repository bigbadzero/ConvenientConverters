package com.example.convenientconverters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MilesToKilos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_to_kilos);
    }


    public void onClick(View v){
        switch(v.getId()){
            case R.id.ConversionButton:
                convertDistance();
                break;
            case R.id.clearButton:
                clear();
                break;

        }
    }

    private void convertDistance(){
        EditText milesText = findViewById(R.id.milesText);
        EditText kilosText = findViewById(R.id.kiloText);
        if(!milesText.getText().toString().matches("")){
            Double miles = Double.parseDouble(milesText.getText().toString());
            Double kilos = (miles * 1.609344);

            kilosText.setText(String.format("%.2f", kilos));
        }

        else if(!kilosText.getText().toString().matches("")){
            Double kilos = Double.parseDouble(kilosText.getText().toString());
            Double miles = (kilos * 0.621371);

            milesText.setText(String.format("%.2f", miles));
        }
    }

    private void clear(){
        EditText milesText = findViewById(R.id.milesText);
        EditText kilosText = findViewById(R.id.kiloText);
        milesText.setText("");
        kilosText.setText("");
    }


}
