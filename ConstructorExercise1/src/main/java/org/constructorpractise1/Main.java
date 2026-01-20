package org.constructorpractise1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        Customer C1=new Customer("defaultName","100000","default1");
        System.out.println(C1.getCreditLimit()+" "+C1.getName()+" "+" "+C1.getEmailAddress());

    Customer C2=new Customer("defaultName","defaultAddress123");
        System.out.println(C2.getCreditLimit()+" "+C2.getName()+" "+" "+C2.getEmailAddress());

    }
}