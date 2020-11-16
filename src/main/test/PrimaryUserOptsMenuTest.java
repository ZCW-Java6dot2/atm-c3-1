import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class PrimaryUserOptsMenuTest {

    @Test
    public void testCheckingAccountOptions(){
        String expectedInput = "1\n2\n1\n50.00\n";
        String expectedOutput = "Deposit processed. New balance: $2050.00";

        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);
    }
}
