package com.gdfbarbosa.calculator;

public class Calculator {
    private Integer result;
    private Integer x;
    private Integer y;

    public Calculator() {
        this.result = 0;
    }

    public Calculator(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        this.result = 0;
    }

    public Integer sum(Integer x, Integer y) {
        result = x + y;
        return result;
    }

    public Integer subtract(Integer x, Integer y) {
        result = x - y;
        return result;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}