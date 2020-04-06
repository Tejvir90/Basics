package com.tdd.springtests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest {

    @Test
    void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
        Money fiveFranc = Money.franc(5);
        assertEquals(Money.franc(10), fiveFranc.times(2));
        assertEquals(Money.franc(15), fiveFranc.times(3));

    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(8));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }


    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());

    }

    @Test
    void testsSimpleAddition() {
        Money five = Money.dollar(5);
        Expression expression = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(expression, five.currency());
        assertEquals(Money.dollar(10), reduced);
    }

//    @Test
//    void testReduceMoneyToDifferentCurrency() {
//        Bank bank = new Bank();
//        bank.addRate("CHF", "USD", 2);
//        Money result = bank.reduce(Money.franc(2), "USD");
//        assertEquals(Money.dollar(1), result);
//    }
//
//    @Test
//    void testIdentityRate() {
//
//        assertEquals(1, new Bank().rate("USD","USD"));
//        assertEquals(1,new Bank().rate("CHF","CHF"));
//    }

}