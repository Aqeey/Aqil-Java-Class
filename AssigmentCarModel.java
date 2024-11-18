public class AssigmentCarModel {
    private String carmodel;
    private int year;
    private double price;
     
    public AssigmentCarModel(String carmodel, int year, double price) {
       this.carmodel = carmodel;
       this.year = year;
       this.price = price;
    }
public void DisplayCarDetail() {
    System.out.println("The car model: " + carmodel);
    System.out.println("Year of manufacture: " + year);
    System.out.println("The price: Rm" + price);
}
public static void main(String[] args) {
    AssigmentCarModel CAR = new AssigmentCarModel("Supra", 1997, 2500000);
    CAR.DisplayCarDetail();

    
}
}
