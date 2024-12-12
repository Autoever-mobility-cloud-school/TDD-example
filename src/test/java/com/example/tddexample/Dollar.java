package com.example.tddexample;

public class Dollar {
    private final int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }

}
