import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AccountsTest {

    @Test
    public void testAccountsConstructor() {
        Users givenCurrentActiveUser = new Users("AmandaW", "IloveJUnittesting", 1844);
        Double givenBalance = 1213.00;

        Accounts newAccount = new Accounts(null, givenCurrentActiveUser, givenBalance);

        Users retrievedCurrentActiveUser = newAccount.getCurrentActiveUser();
        Double retrievedBalance = newAccount.getBalance();

        Assert.assertEquals(givenCurrentActiveUser, retrievedCurrentActiveUser);
        Assert.assertEquals(givenBalance, retrievedBalance);

    }


    @Test
    public void testGetCurrentActiveUser() {
        Accounts currentUserAccount = new Accounts(null, null, 0.0);
        Users newCurrentUser = new Users("AmandaW");
        Users expectedCurrentUser = currentUserAccount.getCurrentActiveUser();
        Users actualCurrentUser = currentUserAccount.getCurrentActiveUser();

        Assert.assertEquals(expectedCurrentUser, actualCurrentUser);
    }

    @Test
    public void testGetBalance() {
        Accounts newAccount = new Accounts(null, null, 11.40);
        Double expectedBal = 11.40;

        Double actualBal = newAccount.getBalance();

        Assert.assertEquals(expectedBal, actualBal);

    }

    @Test
    public void testRunMenuOptions() {
        String expectedInput = "1\n1\n500.00\n";
        String expectedOutput = "Deposit processed. New balance: $500.00";

        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Users newCheckingUser = new Users();
        List actualOutput = newCheckingUser.getTransactionHistory(); // this is returning null, not sure how to get the actual output
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}












