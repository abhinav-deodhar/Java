package org.constructorpractise1;

public class Account {

    private double Number;
    private double balance;
    private String Name;
    private String address;
    private String email;

    public Account(double number, double balance, String name, String address, String email) {
        Number = number;
        this.balance = balance;
        Name = name;
        this.address = address;
        this.email = email;
    }
    //Here we going to declare other constructor

    public Account(String name, String address, String email) {
        this(9959,1110,name,address,email);
        Name = name;
        this.address = address;
        this.email = email;
    }


    //Setters and Getters

    public double getNumber() {
        return Number;
    }

    public void setNumber(double number) {
        Number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
