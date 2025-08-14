import java.util.Random;
import java.util.Scanner;;

class randomNumber {
    public static void main(String[] args) {
        System.out.println("MAXIMUM 5 ATTEMPTS YOU HAVE  \n");
        int attempts = 0;
        for (int i = 1; i <= 5; i++) {
            // User Number

            int userchoice;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter User Number :");
            userchoice = sc.nextInt();
            System.out.println("UserChoice :" + userchoice);

            // Random Generated Number

            Random r = new Random();
            int ranchoice = r.nextInt(0, 100) + 1;
            System.out.println("RandomChoice : " + ranchoice);
            System.out.println();

            if (userchoice > ranchoice) {
                System.out.println("Sorry UserChoice is More than ranchoice");
            } else {
                System.out.println("Sorry ranChoice is More than Userchoice");
            }

            if (userchoice == ranchoice) {
                System.out.println("Both same...");
            } else {
                System.out.println("Both Choices are Not Same...");
            }
            System.out.println();
            attempts++;
            System.out.println("Your Attempt : " + attempts);
            System.out.println("Please Play Again Next Round...." + "\n");

        }
    }
}