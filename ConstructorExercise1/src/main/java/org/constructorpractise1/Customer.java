package org.constructorpractise1;

public class Customer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public Customer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        name="Aryan";
        creditLimit="1000000.00";
        emailAddress="defaultAddress@.com";
    }

    public Customer(String name, String emailAddress) {
        this(name,"300000",emailAddress);

    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }
}
