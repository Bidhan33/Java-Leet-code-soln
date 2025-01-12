import java.util.Scanner;
public class v1 {
  
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subject: ");
        String Subject = scanner.nextLine();
        System.out.print("Enter the verb: ");
        String Verb = scanner.nextLine();
        System.out.print("Enter the object: ");
        String Object = scanner.nextLine();
        scanner.close();
        

        System.out.println( Subject + " " + Verb + " " + Object);


        System.out.println();
    }
}
