package com.tdd.springtests;

import java.util.HashMap;

public class Bank {

    HashMap<String, Integer>  map = new HashMap();

    public Money reduce(Expression source, String currency) {

        return source.reduce(currency);
    }

    public void addRate(String from, String to, int conversionRate) {
        map.put(from+to , Integer.valueOf(conversionRate));
    }

    public int rate(String from, String to) {
        return map.get(from+to);
    }
}
