

import java.util.Scanner;

public class BonusProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the car's selling price: ");
        String firstInt = scanner.next().replace(',', '.'); 
        double  firstInt = Double.parseDouble(firstInt);

        double bonus;
        if(firstInt <50000){
            bonus = firstInt * 0.01;
        }else{
            bonus = firstInt * 0.015;
        }

        if (bonus < 200){
            bonus = 200;
        }
        System.out.printf("The salesperson's bonus is: %.2f euros%n", bonus);
        
        
        scanner.close();
    }
}
