package org.example;

public class Main {
    public static void main(String[] args) {
        Account myAccount=new Account();
        myAccount.setAccountNumber("1111556778998");
        myAccount.setAccountBalance(5000000);
        myAccount.setCustomerName("abc zyx");
        myAccount.setEmail("abc@example.com");
        myAccount.setPhoneNumber("+91-123456789");

        System.out.println("Account Number: "+myAccount.getAccountNumber());
        System.out.println("Account Balance: "+myAccount.getAccountBalance());
        System.out.println("Customer Name: "+myAccount.getCustomerName());
        System.out.println("Email: "+myAccount.getEmail());
        System.out.println("Phone Number:"+myAccount.getPhoneNumber());

        myAccount.depositAmount(5000);
        myAccount.withdrawAmount(100000);

    }
}