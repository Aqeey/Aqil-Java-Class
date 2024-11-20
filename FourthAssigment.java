public class FourthAssigment {
    public static void main(String[] args) {

        String[][] car = new String[3][3];

        car[0][0] = "Axia" ; car[0][1] = "Myvi"; car[0][2] = "Aruz";
        car[1][0] = "Vios"; car[1][1] = "Civic"; car[1][2] = "Stream"; 
        car[2][0] = "Gtr"; car[2][1] = "Supra"; car[2][2] = "Evo"; 

        int [][] price = {
            {10000, 20000, 30000},
            {40000,50000,60000},
            {70000,80000,90000}
        };

        System.out.println("List Car for Rich People: ");

        for (int row=0; row<price.length; row++) {
            for (int col=0; col<price[row].length; col++) {
            if (price[row][col] > 50000){
                System.out.println(car[row][col] + "  price is " + price [row][col]);
        }else {
            
        }

 
        } 
    }
}
}
