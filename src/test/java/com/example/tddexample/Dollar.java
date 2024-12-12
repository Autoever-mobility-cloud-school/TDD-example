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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dollar other) {
            return this.amount == other.amount;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(amount);
    }

}
