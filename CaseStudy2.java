import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CaseStudy2 {
    public static void main(String[] args) throws IOException {
     // Get file name from user
        String fileName = getFileName();
     // Check if user does not enter anything or Cancel.
        if (fileName == null){
            JOptionPane.showMessageDialog(null,"Invalid");
            System.exit(0);
        }

        double total = getTtotalSales(fileName);
        double average = 0.0;
        displayResults(total, average);
        
    }
    public static String getFileName(){
        String MonthlySales = JOptionPane.showInputDialog("Enter the name of the file \ncontaining 30 days of sales amounts. ");
       return MonthlySales;

    }
    public static Double getTtotalSales(String MonthlySales) throws IOException{
        File file = new File(MonthlySales);
        Scanner readFile = new Scanner(file);
        double total = 0.0;
        int countingLine = 0;

    // To read 30 line of data
        for (int i = 1; i<= 30; i++){
            if (readFile.hasNextDouble()){
                total = total + readFile.nextDouble();
                countingLine ++;
            }
            else {
                System.out.println("Wrong data");
                System.exit(0);
            }
        }
    // Check if file did not enough 30 line
        if  (countingLine < 30){
            System.out.println("Invadlid length");
            System.exit(0);
        }
        return total;
        

    }
    // Display total and average in dialog box
    public static void displayResults(double total, double average ){
        average = total / 30;
        String formatString = String.format("The total sales for the period is $%.2f\n The average daily sales were $%.2f",total, average);
        JOptionPane.showMessageDialog(null, formatString);
    }
}
// Test Case:
// # Input 1: file with enough 30 lines.
//   Output 1: clear calculation and results
// # Input 2: with file which is does not in the form txt
//   Output 2: cannot read the file
// # Input 3: file with 29 lines
//   Output 3: Invadlid length
// I got stuck when trying to arrange logic and check condition to make sure I did not miss any of them
// Next time, I'll notify to user if they do not use the right form of file.