import javax.swing.JOptionPane;
public class CaseStudy1 {
    public static void main(String[] args) {  
        // Get input from user
        String inputMoney= JOptionPane.showInputDialog("What is your annual salary?");
        double salary = Double.parseDouble(inputMoney);
        String inputRating = JOptionPane.showInputDialog("On a scale of 1 through 10, what is your credit rating? \n (10 = excellent, 1 = very bad)");
        int creditRating = Integer.parseInt(inputRating);

        // Check if user does not enter any information
        if (inputMoney == null){
            JOptionPane.showMessageDialog(null,"Invalid");
            System.exit(0);
        }
        // Condition 1: when both salary and credit rating cannot be negative number (addition)
        if (salary < 0 || creditRating < 0) {
            if (salary < 0) {
                JOptionPane.showMessageDialog(null,"Salary can't be a negative number! ");
                System.exit(0);

            }
            else{
                JOptionPane.showMessageDialog(null,"Credit rating can't be a negative number!");
                System.exit(0);
            }
        }
        // Condition 2: check the standardd condition follow up instructions. 
       else if (salary > 20000 && creditRating >= 7){
            qualify();
        }
        else{
            noQualify();
        }
        System.exit(0);

    }
    // Showing dialog box to notify whether user satifies the condition.
    public static void qualify(){
        JOptionPane.showMessageDialog(null, ("Congratulations! You qualify for the credit card!"));
    } 
    public static void noQualify(){
        JOptionPane.showMessageDialog(null, ("Invalid"));
    }
}
// Test Case:
// # Input 1: salary = -2 and credit rating = 2
//   Output 1: Invalid
// # Input 2: salary = 40000 and credit rating = 0
//   Output 2: Invalid
// # Input 3: salary = 30000 and credit rating = 8
//   Output 3: Congratulations! You qualify for the credit card!

// I got trouble in the first period because I did not convert data from salary and credit rating. 
// If i have more time, I will think about another method to make my code clearer and shorter. 