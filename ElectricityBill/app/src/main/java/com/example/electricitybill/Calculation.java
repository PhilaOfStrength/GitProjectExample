package com.example.electricitybill;
//import java.util.*;
//import java.util.ArrayList;

public class Calculation {

    static double EnergySavingLights(int LightsNumber,double LightHours){
        double EnergyLights= ((LightsNumber*LightHours*0.1*250)+(30*LightsNumber));
        return EnergyLights;
    }
    static double SavingAirConditioner(int AirConNumber,double AirConHours){
        double EnergyAirCons= ((AirConNumber*1*AirConHours*250)+(2000*AirConNumber));
        return EnergyAirCons;
    }
    static double OriginalLights(double LightsNumber,double LightHours ){
        double OriginalCost= ((LightsNumber*LightHours*0.8*250)+(10*LightsNumber));
        return OriginalCost;
    }
    static double OriginalAirCon(int AirConNumber,double AirConHours){
        double AirConCost = ((AirConNumber*1.20*AirConHours*250)+(1500*AirConNumber));
        return AirConCost;
    }
}
