import java.util.Scanner;

public class ThirdAssigmentCar {
    
private String car;
private double price; 

public ThirdAssigmentCar( String car, double price) {
   this.car = car;
   this.price = price;

}

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter Car Model");
    String car = scanner.nextLine();
    System.out.println("Enter Car Price");
    double price = scanner.nextDouble();

    ThirdAssigmentCar harga = new ThirdAssigmentCar (car, price);


  switch (car) {
      case "Axia":
      if (price > 10000 || price == 10000) {
        System.out.println("You are VIP");
      }else {
       System.out.println("You are not VIP");
     }default:
     if (price > 10000 || price == 10000) {
        System.out.println("You are VIP");
      }else 
       System.out.println("You are not VIP");
}
}
}
