import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int myNumber = (int) (Math.random() * 100);

        System.out.println("Guess my number (between 0 and 99):");

        do {
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO....CORRECT NUMBER!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while (userNumber >= 0);

        System.out.println("My number was: " + myNumber);
    }
}
}