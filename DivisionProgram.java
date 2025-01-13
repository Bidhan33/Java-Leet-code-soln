
}
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter an integer: ");
        int firstInt = scanner.nextInt();

        
        System.out.print("Enter another integer: ");
        int secondInt = scanner.nextInt();

    
        System.out.print("Enter a decimal number: ");
        String decimalInput = scanner.next().replace(',', '.'); 
        double decimalNumber = Double.parseDouble(decimalInput);

        
        System.out.println();
        System.out.println(firstInt + " / " + secondInt + " = " + (firstInt / secondInt));
        System.out.println(secondInt + " / " + firstInt + " = " + (secondInt / firstInt));
        System.out.println(firstInt + " / " + decimalNumber + " = " + (firstInt / decimalNumber));
        System.out.println(decimalNumber + " / " + firstInt + " = " + (decimalNumber / firstInt));
        
        scanner.close();
    }
}
