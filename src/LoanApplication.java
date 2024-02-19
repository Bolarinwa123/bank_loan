import java.util.Scanner;

public class LoanApplication {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your monthly income");
        double income = scanner.nextInt();

        System.out.println("Will you pay at the right time (yes/no)");
        String time = scanner.next();

        boolean loanApproved = checkLoanCondition( age, income, time);

        if (loanApproved) {

            System.out.println("Congratulations, your loan have been approved");
        } else {
            System.out.println("Sorry, your loan appilcation has been rejected");
        }
    }
    public static boolean checkLoanCondition(int age, double income, String time) {
      return age >= 20 && income >= 1000 && time.equalsIgnoreCase("yes");
    }
}
