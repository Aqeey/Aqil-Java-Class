import java.util.Scanner;

public class SecondAssigment {

private String car;
private String make;
private long  price; 
Scanner scanner = new Scanner(System.in); 

public SecondAssigment() {

    System.out.println("Enter Car Model");
    this.car = scanner.nextLine();
    System.out.println("Enter Car Make from");
    this.make = scanner.nextLine();
    System.out.println("Enter Car Price");
    this.price = scanner.nextLong();
}
public void printdetails (){

    System.out.println("Car Model = " + car);
    System.out.println("Car Model = " + make);
    System.out.println("Car Model = " + price);
}
    
public static void main(String[] args) {
    SecondAssigment car1 = new SecondAssigment();
    SecondAssigment car2 = new SecondAssigment();
    SecondAssigment car3 = new SecondAssigment();

    car1.printdetails();
    car2.printdetails();
    car3.printdetails();
    System.out.println("Average price is " + (car1.price + car2.price + car3.price) / 3 );


}


}
