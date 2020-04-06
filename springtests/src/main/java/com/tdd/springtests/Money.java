package com.tdd.springtests;

import com.tdd.springtests.enums.Currencies;

public class Money implements Expression {
    protected int amount;
    public String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }

    protected String currency() {
        return currency;
    }

    static public Money dollar(int amount) {
        return new Money(amount, Currencies.USD.getName());
    }

    public static Money franc(int amount) {
        return new Money(amount, Currencies.CHF.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Money money = (Money) o;
        return amount == money.amount && currency == money.currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(String currency) {
        return this;
    }
}
