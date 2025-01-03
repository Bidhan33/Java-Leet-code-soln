
// {Enter a decimal number: 2,5
// Enter a decimal number: 3,1415926

// 2,50 * 3,14 = 7,85
// 2,50 * 3,14 = 7,853981




import java.text.DecimalFormat;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double number1 = readDouble(input);

        System.out.print("Enter a decimal number: ");
        double number2 = readDouble(input);

        double result = number1 * number2;

        DecimalFormat decimalFormatTwo = new DecimalFormat("0.00");
        DecimalFormat decimalFormatSix = new DecimalFormat("0.000000");

        System.out.println("\n" + decimalFormatTwo.format(number1) + " * " + decimalFormatTwo.format(number2) +
                " = " + decimalFormatTwo.format(result));
        System.out.println(decimalFormatTwo.format(number1) + " * " + decimalFormatTwo.format(number2) +
                " = " + decimalFormatSix.format(result));
    }

    private static double readDouble(Scanner scanner) {
        String input = scanner.nextLine().replace(',', '.');
        return Double.parseDouble(input);
    }
}

