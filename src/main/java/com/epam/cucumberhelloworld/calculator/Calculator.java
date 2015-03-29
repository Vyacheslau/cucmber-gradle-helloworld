package com.epam.cucumberhelloworld.calculator;

/**
 * Created by Vyacheslau Karachun on 26.03.2015.
 */
public class Calculator {

    public Integer operation(String operationName, int var1, int var2) {
        switch (operationName) {
            case "add":
                return var1 + var2;
            default:
                throw new IllegalArgumentException("Operation [" + operationName + "] is not supported.");
        }
    }
}
