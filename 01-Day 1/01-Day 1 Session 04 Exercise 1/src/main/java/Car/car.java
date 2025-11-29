package Car;
//logical group to store the similar classes called as package.

public class car {

    //data members
    private String make;
    private String color;
    private String model;
    private int doors;
    private boolean convertible;

    //here access modifier is private for data members.


    //method with public access modifier.
    //method is not static because it is interacting with instance fields.
    public void describeCar(){
        System.out.println("Doors:"+doors+
                "\nColor: "+color+
                "\nModel: "+model+
                "\nConvertible: "+convertible+
                "\nMake: "+make);

    }

}
