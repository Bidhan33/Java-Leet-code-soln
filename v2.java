import java.util.Scanner;
public class v2 {
  
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter applicants's name: ");
        String  name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age =Integer.parseInt(scanner.nextLine());

        System.out.print("Enter hometown: ");
        String Object = scanner.nextLine();
        scanner.close();
        
        if (age <= 18){
            System.out.println(name + ", who is a major ," + "lives in " + Object);
        }else{
            System.out.println(name + ", who is a minor ," + "lives in " + Object);
        }
        
    }
        
}
