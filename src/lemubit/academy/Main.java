package lemubit.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Was it nice (Yes) (No) (Maybe)");
        var userInput = sc.nextLine();
        var userInputCaps = userInput.toUpperCase();

        var choice = Choice.valueOf(userInputCaps);

        switch (choice) {
            case YES:
                System.out.println("Glad you are happy...");
                break;
            case NO:
                System.out.println("How could we help");
                break;
            case MAYBE:
                System.out.println("Hmmm... a little more info");
                break;
        }
    }
}
