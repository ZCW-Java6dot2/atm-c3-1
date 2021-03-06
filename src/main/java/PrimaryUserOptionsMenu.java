import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimaryUserOptionsMenu {
    private Scanner scanner;
    private Accounts accounts;

    public PrimaryUserOptionsMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runMainUserOptionsMenu(Users currentActiveUser) {
        boolean powerOn = true;
        System.out.println("\nYou have successfully logged into " + currentActiveUser.getUsername() + "'s profile.");
        while (ATMConsole.isAtmPowerOn() && powerOn) {

            this.accounts = new Accounts(scanner, 0.0);

            System.out.println("\n" +
                    "Please select from the following options:\n" +
                    "1 - Access Account Menu\n" +
                    "2 - Access User Profile Info\n" +
                    "3 - Cancel Transaction\n" +
                    "---------------------------------\n" +
                    "Enter choice here: -> ");

            try {
                int input = scanner.nextInt();
                switch(input) {
                    case 1:
                        accounts.runAccountMenuOptions(currentActiveUser);
                        break;
                    case 2:
                        currentActiveUser.changeUserProfiles(currentActiveUser);
                        break;
                    case 3:
                        System.out.println("You have canceled the transaction.\n" +
                                "Enjoy the rest of your day.");
                        powerOn = false;
                        ATMConsole.setAtmPowerOn(false);
                        break;
                    default:
                        System.out.println("\n" + "Incorrect option chosen, please choose one of the menu options below.");
                        break;
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("\n" + "Incorrect option chosen, please choose one of the menu options below.");
            }
        }
    }
}
