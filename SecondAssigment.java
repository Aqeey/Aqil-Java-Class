import java.util.Scanner;

public class SecondAssigment {

private String car;
private String make;
private long  price; 

public SecondAssigment() {
   
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter Car Model");
    this.car = scanner.nextLine();
    System.out.println("Enter Car Make from");
    this.make = scanner.nextLine();
    System.out.println("Enter Car Price");
    this.price = scanner.nextLong();
}

    
public static void main(String[] args) {
    SecondAssigment car1 = new SecondAssigment();
    SecondAssigment car2 = new SecondAssigment();
    SecondAssigment car3 = new SecondAssigment();


    System.out.println("Average car price  is " + (car1.price + car2.price + car3.price) / 3 );


}


}
