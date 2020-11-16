
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.io.Console;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class UsersTest {
//    @Test
//    public void userConstructorTest(){
//        // Given
//        String expectedUsername = "bankmember1";
//        Users amanda = new Users(expectedUsername);
//        // When
//        String actualUsername = amanda.getUsername();
//        // Then
//        Assert.assertEquals(expectedUsername, actualUsername);
//    }
//    @Test
//    public void setUserNameTest(){
//        // Given
//        String expectedUserName = "christian2";
//        Users christian = new Users();
//
//        // When
//        christian.setUsername(expectedUserName);
//        String actualUserName = christian.getUsername();
//
//        // Then
//        Assert.assertEquals(expectedUserName, actualUserName);
//    }
//
//    @Test
//    public void setPasswordTest(){
//        // Given
//        String expectedPassword = "c00lg!rl7";
//        Users amanda = new Users();
//
//        // When
//        amanda.setPassword(expectedPassword);
//        String actualPassword = amanda.getPassword();
//
//        // Then
//        Assert.assertEquals(expectedPassword, actualPassword);
//    }
//
//    @Test
//    public void setPINTest(){
//        // Given
//        Integer expectedPIN = 1234;
//        Users amanda = new Users();
//
//        // When
//        amanda.setPinNumber(expectedPIN);
//        Integer actualPIN = amanda.getPinNumber();
//
//        // Then
//        Assert.assertEquals(expectedPIN, actualPIN);
//    }
//
//    @Test
//    public void setTransactionHistoryTest(){
//        // Given
//        List<String> expectedTH = new ArrayList<String>(Collections.singleton("Test"));
//        Users peter = new Users();
//
//        // When
//        peter.setTransactionHistory(expectedTH);
//        List<String> actualTH = peter.getTransactionHistory();
//
//        // Then
//        Assert.assertEquals(expectedTH, actualTH);
//    }
//
//    @Test
//    public void setCheckingTest(){
//        // Given
//        Checking expectedChecking = Checking;
//        Users hillary = new Users();
//
//        // When
//
//        // Then
//
//    }
//}