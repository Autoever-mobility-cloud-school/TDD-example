package com.example.tddexample;

public class Franc {
    private final int amount;

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Franc other) {
            return this.amount == other.amount;
        }
        return false;
    }
}
