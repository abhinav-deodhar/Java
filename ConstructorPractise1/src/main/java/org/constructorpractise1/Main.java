package org.constructorpractise1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!/n");

        Car car1=new Car();
        //Here Java implicitly declares and calls  a constructor.
        //This is no args constructor.
        //In order to set values then we need to call all the setters
        //but if we do not need to write the code to call the setter functions then we can use constructor.

        car1.setColor("Yello");
        car1.setTopSpeed(50.00);
        car1.setModel("Tesla");
        car1.setWheels(4);

        System.out.println((car1.getColor()+" "+
                car1.getModel()+" "+
                car1.getTopSpeed()+" "+
                car1.getWheels()));

        Car car2=new Car(50.00,"Red,","Tata",4);
        System.out.println(car2.getColor()+" "+
        car2.getModel()+" "+
        car2.getTopSpeed()+" "+
        car2.getWheels());
    }
}