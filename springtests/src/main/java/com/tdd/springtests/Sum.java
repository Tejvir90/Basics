package com.tdd.springtests;

public class Sum implements Expression{

    Money augment;
    Money addend;


    public Sum(Money augment, Money addend) {
        this.augment = augment;
        this.addend = addend;
    }

    @Override
    public Money reduce(String currency) {
        return new Money(augment.amount+addend.amount, currency);
    }
}
