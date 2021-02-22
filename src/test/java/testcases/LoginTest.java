package testcases;

import com.telran.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    //hatum//21$Hatum21$

@Test
    public  void loginTest(){
    new LoginPage(driver)
            .login("hatum","21$Hatum21$")
            .verifyUserName("hatum")
            .logout();


}

}
