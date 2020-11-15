import java.util.InputMismatchException;
import java.util.Scanner;

public class Accounts {
    private Scanner scanner;
    private Users currentActiveUser;
    private Double balance;
    private Checking checking;
    private Savings savings;
    private Investment investment;

    public Accounts(Scanner scanner, Users currentActiveUser, Double balance) {
        this.scanner = scanner;
        this.currentActiveUser = currentActiveUser;
        this.balance = balance;
    }

    public Accounts(Users currentActiveUser) {
        this.currentActiveUser = currentActiveUser;
        this.balance = 0.00;
    }

    public Users getCurrentActiveUser() {
        return currentActiveUser;
    }

    public void setCurrentActiveUser(Users currentActiveUser) {
        this.currentActiveUser = currentActiveUser;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void runAccountMenuOptions() {
        boolean powerOn = true;
        while (ATMConsole.isAtmPowerOn() && powerOn) {
            System.out.println("\n" +
                    "Please select from the following options:\n" +
                    "1 - Checking Account Menu\n" +
                    "2 - Savings Account Menu\n" +
                    "3 - Investment Account Menu\n" +
                    "4 - Open New Account\n" +
                    "5 - Close an Account\n" +
                    "6 - Go Back to Primary User Options Menu\n" +
                    "7 - Cancel Transaction\n" +
                    "---------------------------------\n" +
                    "Enter choice here: -> ");

            try{
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        checking.checkingAccountOptions(currentActiveUser);
                        break;
                    case 2:
                        savings.savingsAccountOptions(currentActiveUser);
                        break;
                    case 3:
                        investment.investmentAccountOptions(currentActiveUser);
                        break;
                    case 4:
                        System.out.println("Please indicate which type of account you would like to create?\n" +
                                "1 - Checking Account\n" +
                                "2 - Savings Account\n" +
                                "3 - Investment Account");
                        int newAccountChoice = scanner.nextInt();
                        if (newAccountChoice == 1) {
                            Checking checking = new Checking(currentActiveUser);
                        } else if (newAccountChoice == 2) {
                            Savings savings = new Savings(currentActiveUser);
                        } else {
                            Investment investment = new Investment(currentActiveUser);
                        }
                        break;
                    case 5:
                        System.out.println("Please indicate which type of account you would like to delete?\n" +
                                "1 - Checking Account\n" +
                                "2 - Savings Account\n" +
                                "3 - Investment Account");
                        int deleteAccountChoice = scanner.nextInt();
                        if (deleteAccountChoice == 1) {
                            currentActiveUser.setChecking(null);
                        } else if (deleteAccountChoice == 2) {
                            currentActiveUser.setSavings(null);
                        } else {
                            currentActiveUser.setInvestment(null);
                        }
                        break;
                    case 6:
                        powerOn = false;
                        break;
                    case 7:
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
