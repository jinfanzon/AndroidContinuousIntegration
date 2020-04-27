package io.iic.helloworld;


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
        return (input1 + input2);
    }

    @Override
    public double subtract(double input1, double input2) {
        return (input1 - input2);
    }

    @Override
    public double multiply(double input1, double input2) {
        return 0;
    }

    @Override
    public double divide(double input1, double input2) {
        if(input2==0)
            return -1;
        else
            return (input1 / input2);
    }
}
