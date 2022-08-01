package org.example;

public class Main {
    public static void main(String[] args) {

        Bank b1=new Bank("ICICI Bank","Tilakwadi, RPD Cross","Belagavi","590006");
        Customer c1=new Customer(100,"Akay","Hindwadi","Belagavi");
        Account a=new SBAccount(5000.0f);
        a.showAccountDetails(a);
        System.out.println("Your bank is "+b1.bankName);
    }
}