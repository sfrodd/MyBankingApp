package org.example;

public class SBAccount implements Account{
    float acctBalance;

    public SBAccount(float acctBalance) {
        this.acctBalance = acctBalance;
    }

    @Override
    public Account createAccount(Customer c) {
        acctBalance=c.custBalance;
        return this;
    }

    public void display(String msg){
        System.out.println("Our message ... "+msg);
    }

    @Override
    public void showAccountDetails(Account a) {
        System.out.println("Account details");
    }
}
