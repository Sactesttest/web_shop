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

    @AfterClass
    public static void Close_Browser() throws Exception{
       driver.quit();
    }

}
