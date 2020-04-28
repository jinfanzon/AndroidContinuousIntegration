package io.iic.helloworld;


import android.util.Log;

public class Calculator implements CalculatorService {

    private CalculatorService service;
    public Calculator(CalculatorService service) {
        this.service = service;
    }
    public double execute(double a, double b){
        return service.add(a,b)*a;
    }

    @Override
    public double add(double input1, double input2) {
        Log.d(Calculator.class.getCanonicalName(), "This is addition");
        return (input1 + input2);
    }

    @Override
    public double subtract(double input1, double input2) {
        Log.d(Calculator.class.getCanonicalName(), "This is substract");
        return (input1 - input2);
    }

    @Override
    public double multiply(double input1, double input2) {
        Log.d(Calculator.class.getCanonicalName(), "This is multiply operation");
        return 0;
    }

    @Override
    public double divide(double input1, double input2) {
        Log.d(Calculator.class.getCanonicalName(), "This is divide operation");
        if(input2==0)
            return -1;
        else
            return (input1 / input2);
    }
}
