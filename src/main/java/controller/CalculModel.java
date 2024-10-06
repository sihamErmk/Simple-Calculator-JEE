package controller;

public class CalculModel {
    private  double result;
    private  String operation;
    private  double  op1;
    private double op2;


    public CalculModel() {
        super();
    }
     public CalculModel(double result, String operation, double op1, double op2){
        super();
        this.result = result;
        this.operation = operation;
        this.op1 = op1;
        this.op2 = op2;
     }

    public void setResult(double result) {
        this.result = result;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public double getResult() {
        return result;
    }

    public String getOperation() {
        return operation;
    }

    public double getOp1() {
        return op1;
    }

    public double getOp2() {
        return op2;
    }
}
