package org.example;

public class Customer {
    int custID;
    float custBalance;
    String custName;
    String custAddress;
    String custCity;

    public Customer(int custID, String custName, String custAddress, String custCity) {
        this.custID = custID;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custCity = custCity;
    }

}
