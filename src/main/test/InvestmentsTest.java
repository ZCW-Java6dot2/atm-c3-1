import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class InvestmentsTest {

    @Test
    public void testInvestmentsAccountOptions(){
        String expectedInput = "1\n300.00\n";
        String expectedOutput = "Deposit processed. New balance: $10342.72";

        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);
    }

}
