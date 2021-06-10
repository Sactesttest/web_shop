package Scripts;

import Base.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Pages.Page_Home.*;

public class HomePage extends TestBase {

    @BeforeClass
    public static void Pre_Conditions() throws Exception{
        Browser_SetUP("chrome");
        Redirection_URL("http://demowebshop.tricentis.com");
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    public static void Verify_Search_File() throws Exception{
        Enter_Value_In_Search_Filed();
        Verify_User_Is_On_SearchPage();
    }
    @Test (priority=2)
    public static void LogIn()throws Exception{
        Click_LogIn_Button();
        Email_Input_Textbox();
        Password_Input_Textbox();
        Thread.sleep(2000);
        Click_LogIn_Button_For_Login();
    }

    @AfterClass
    public static void Close_Browser() throws Exception{
       driver.quit();
    }

}
