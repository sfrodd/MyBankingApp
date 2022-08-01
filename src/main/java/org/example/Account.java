package org.example;

public interface Account {

     Account createAccount(Customer c);
     void showAccountDetails(Account a);
}

public interface Loans{
     float computeInterest(Account a);
}
