import java.util.Scanner;
public class Assignment21 {
    public static void main (String[] args ) {
        Scanner score = new Scanner(System.in);
        System.out.print("Enter score 1: ");
        int score1 = score.nextInt();
        System.out.print("Enter score 2: ");
        int score2 = score.nextInt();
        System.out.print("Enter score 3: ");
        int score3 = score.nextInt();

        double sum = ( score1 + score2 + score3 ) / 3;
        System.out.println("Average: " + sum);

        if ( sum >= 90 && sum <= 100 ) {
            System.out.println("Grade: A");
        }
        else if ( sum >= 80 && sum <= 89 ) {
            System.out.println("Grade: B");
        }
        else if ( sum >= 70 && sum <= 79 ) {
            System.out.println("Grade: C");
        }
        else if ( sum >= 60 && sum <= 69 ) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
         }
         score.close();
        }
    }

