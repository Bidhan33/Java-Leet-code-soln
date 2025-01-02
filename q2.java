
import java.util.Scanner;

class Coach {
    private String name;
    private int score;

    public Coach(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Coach[] coaches = new Coach[4];

        
        for (int i = 0; i < coaches.length; i++) {
            System.out.print("Enter coach name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter " + name + "'s score: ");
            int score = Integer.parseInt(scanner.nextLine());

            coaches[i] = new Coach(name, score);
        }

        
        System.out.print("Enter the minimum passing score: ");
        int minPassingScore = Integer.parseInt(scanner.nextLine());
		
		
		
			
  
        System.out.println("\nPassing scores");
        int numPass = 0;
        for (int i = 0; i < coaches.length; i++) {
            Coach coach = coaches[i];
            if (coach.getScore() >= minPassingScore) {
                System.out.println(coach.getName() + " (" + coach.getScore() + " points)");
                numPass++;
            }
        }


        
        double passingRate = (double) numPass / coaches.length * 100;
        System.out.println("The passing rate is " + passingRate + " %");

        
        scanner.close();
    }
}
