import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double ACCELERATION_BY_GRAVITY = 9.8 ;
        System.out.print("Enter the mass: ");
        double mass = input.nextInt();
        double weight = mass * ACCELERATION_BY_GRAVITY;
        if (weight > 1000) {
            System.out.println("too heavy");
        }
        else if (weight<10) {
            System.out.println("too light ");
        }
        else {
            System.out.println("Normal");
        }
        input.close();


    }
    
}
