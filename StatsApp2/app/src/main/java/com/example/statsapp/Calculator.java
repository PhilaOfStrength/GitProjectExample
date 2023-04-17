package com.example.statsapp;
import java.util.ArrayList;
import java.util.*;
import java.lang.Math;

public class Calculator {
    /*public static double getMean(ArrayList<Double> v){
        double total, mean, n;
        total = 0;
        for (Double i : v){
            total += i;
        }
        n = v.size();
        mean = total/n;
        return mean;
    }

    public static double getVariance(ArrayList<Double> v){
        double mean, total, n, var;
        mean = getMean(v);
        total = 0;
        n = v.size();

        for (Double i: v){
            total += Math.pow(i-mean, 2);
        }
        var = total/n;
        return var;
    }

    public static double getStdDev(ArrayList<Double> v){
        double var, StdDev;
        var = getVariance(v);
        StdDev = Math.sqrt(var);
        return StdDev;
    }*/
    public static double getMean(ArrayList<Double> list1){

        double mean;
        double sum = 0.0;
        for (int i = 0; i < list1.size();i++){
            sum += list1.get(i);
        }
        mean = sum/list1.size();
        return mean;
    }

    public static double getVariance(ArrayList<Double> list2) {

        double variance = 0.0;
        double mean = getMean(list2);
        for (double i : list2){
            variance +=(i-mean)*(i-mean);
        }
        return variance/(list2.size());
    }

    public static double getStdDev(ArrayList<Double> list3){

        double stdDev;
        double sd = 0.0;
        double mean = getMean(list3);

        for (int i = 0; i < list3.size(); i++){
            sd += ((list3.get(i)-mean)*(list3.get(i)-mean))/list3.size();
        }
        stdDev = Math.sqrt(sd);
        return stdDev;
    }
}
