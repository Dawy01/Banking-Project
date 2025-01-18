import java.util.Scanner;
public class Main {
    public static void main(String [] args){
    printAccountDetails();

    }


    public static void printAccountDetails(){
        Account showDetails= new Account();
        Scanner scanner= new Scanner(System.in);
        for(int i = 0; i<3 ; i++ ) {
            System.out.print("Please enter your account number: ");
            int userInput= scanner.nextInt();
            System.out.print("Please enter your pincode: ");
            String userPin= scanner.next();
            if(userInput == showDetails.getAccountId() && userPin.equals(showDetails.getPincode())) {
                showDetails.printAccountDetails(123456789, "Mohamed");
                return;
            }
            else if (i<2) {
                System.out.println("Incorrect input, please try again\n");
            }
            else if(i==2)
                System.out.println("\nYou've tried 3 times, please call your bank call center to unlock your account");
        }
    }

}
