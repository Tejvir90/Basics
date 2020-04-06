package com.tdd.springtests.enums;

public enum Currencies {

    USD("USD"),
    CHF("CHF");


    private String name;

    Currencies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
