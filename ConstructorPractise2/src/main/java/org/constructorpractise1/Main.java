package org.constructorpractise1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        Account account1=new Account("tina","email","Pune");

        System.out.println(account1.getNumber()+" "+account1.getBalance()); }
    }

    //When we use this method then it should be first statement in the constructor.
//The control goes to the constructor 2 to which this function is refering and then comes back to the first constructor.

