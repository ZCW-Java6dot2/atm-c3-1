import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SavingsTest {

    @Test
    public void testSavingsAccountOptions(){
        String expectedInput = "2\n40.00\n";
        String expectedOutput = "Withdrawal processed. New balance: $300.00";

        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);
    }
}
