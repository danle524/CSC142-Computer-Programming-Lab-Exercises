import java.util.Scanner;
public class Assingment22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter number of checks: ");
        int checks = input.nextInt();
        
        final double BASEFEE = 10.00;
        String BASE_FEE = String.format("$%.2f",BASEFEE);
        System.out.println("Base fee: " + BASE_FEE);

        double Fee_per_check = 0.00;
        if (checks < 20 ) {
            Fee_per_check = 0.10;
        }
        else if ( checks >=20 && checks <= 39 ){
            Fee_per_check = 0.08;
        }
        else if ( checks >= 40 && checks <= 59 ){
            Fee_per_check = 0.06;
        }
        else {
            Fee_per_check = 0.04;
        }
        System.out.println("Fee per check: $" + Fee_per_check);
        double total_service_charge = BASEFEE + ( checks * Fee_per_check);
        String totalFee = String.format("$%.2f",total_service_charge);
        System.out.println("Total service charge: " + totalFee);
        input.close();
    }
    
}
