package org.example;

public class Bank {
    String bankName;
    String bankAddress;
    String city;
    String zipCode;

    public Bank(String bankName, String bankAddress, String city, String zipCode) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCity() {
        return city;
    }
}
