package org.ulpgc.is1.model;

public class Phone {
    private String number;
    public boolean isValid(String proposedNumber) {
        return proposedNumber.length() == 9;
    }
}
