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

    @Override
    public void showAccountDetails(Account a) {
        System.out.println("Account details");
    }
}
