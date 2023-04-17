package com.example.electricitybill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numberOfLights = findViewById(R.id.editTextNumber);
        EditText numberOfHoursLights= findViewById(R.id.editTextNumberDecimal);
        EditText numberOfAirCons= findViewById(R.id.editTextNumber2);
        EditText numberOfHoursAirCon= findViewById(R.id.editTextNumberDecimal2);
        Button FindBestOption = findViewById(R.id.button);
        TextView EnergyOutput= findViewById(R.id.outputEnergySaver);
        TextView OriginalOutput= findViewById(R.id.outputOriginal);

        FindBestOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numLight= numberOfLights.getText().toString();
                int NumLights= Integer.parseInt(numLight);
                String numAirCon= numberOfAirCons.getText().toString();
                int NumAirCon= Integer.parseInt(numAirCon);

                String HoursNum=numberOfHoursLights.getText().toString();
                double LightsHour=Double.parseDouble(HoursNum);
                String AirConHours=numberOfHoursAirCon.getText().toString();
                double HoursAirCon=Double.parseDouble(AirConHours);

                String EnergySaving=" The energy saving option will cost :"+ Double.toString(saving(NumLights,LightsHour,NumAirCon,HoursAirCon));
                String OriginalCost=" The Original option will cost :"+ Double.toString(Original(NumLights,LightsHour,NumAirCon,HoursAirCon));

                EnergyOutput.setText(EnergySaving);
                OriginalOutput.setText(OriginalCost);
            }
        });


    }

    public double saving(int LightsNumber,double LightHours, int AirConNumber,double AirConHours){
        double EnergyLights= ((LightsNumber*LightHours*0.1*250)+(30*LightsNumber));
        double EnergyAirCons= ((AirConNumber*1*AirConHours*250)+(2000*AirConNumber));
        return EnergyLights + EnergyAirCons;
    }

    public double Original(int LightsNumber,double LightHours,int AirConNumber,double AirConHours ){
        double OriginalCost= ((LightsNumber*LightHours*0.8*250)+(10*LightsNumber));
        double AirConCost = ((AirConNumber*1.20*AirConHours*250)+(1500*AirConNumber));
        return OriginalCost + AirConCost;
    }
}