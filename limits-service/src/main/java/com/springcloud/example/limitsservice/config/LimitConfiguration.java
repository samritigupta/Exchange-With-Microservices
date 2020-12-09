package com.springcloud.example.limitsservice.config;

public class LimitConfiguration {
    private int maximum;
    private int minimum;

    protected LimitConfiguration(){

    }

    public LimitConfiguration(int min, int max){
        this.maximum = max;
        this.minimum = min;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
