package org.example;

import java.sql.SQLOutput;

public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //declared all the data  members

//getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setter methods


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositAmount(double amount){
        if(amount>0){
        accountBalance=amount+accountBalance;
        System.out.println("The amount " +amount+" deposited successfully!");}
        else{
            System.out.println("Invalid amount");
        }

    }
    public void withdrawAmount(double amount){
        if(amount>0 && accountBalance-amount<0){
            System.out.println("Insufficient Funds");
        }
        else{
            accountBalance=accountBalance-amount;
            System.out.println("Amount withdrawing success");
        }
    }
}
