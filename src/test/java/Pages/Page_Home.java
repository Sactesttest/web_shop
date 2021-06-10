package Pages;

import Base.TestBase;
import org.apache.maven.model.Site;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Page_Home extends TestBase {

    // ************ Locators ***************

    protected static By Site_Logo= By.xpath("//div[@class='header-logo']//a//img");
    protected static By Register_Link= By.xpath("//a[contains(.,'Register')]");
    protected static By Login_Link= By.xpath("//a[contains(.,'Log in')]");
    protected static By Shopping_Cart_Link= By.xpath("(//a[contains(.,'Shopping cart')])[1]");
    protected static By Wishlist_Link= By.xpath("(//a[contains(.,'Wishlist')])[1]");
    protected static By Search_Field= By.id("small-searchterms");
    protected static By Search_Button= By.xpath("//button[@class='button-1 search-box-button']");
    protected static By Email_Input_Field=By.id("Email");
    protected static By Password_Input_Field=By.id("Password");
    protected static By LogIn_Button=By.xpath("//input[contains(@class,'button-1 login-button')]");
    protected static By Registration_Formular_Gender=By.id("gender-male");
    protected static By Registration_Formular_Firstname=By.id("FirstName");
    protected static By Registration_Formular_Lastname=By.id("LastName");
    protected static By Registration_Formular_Email=By.id("Email");
    protected static By Registration_Formular_Password=By.id("Password");
    protected static By Registration_Formular_ConfirmPassword=By.id("ConfirmPassword");
    protected static By Registration_Formular_Button=By.id("register-button");






    // **** Page Actions ******


    public static void Input_Registration_Formular_Gender()throws Exception{
        driver.findElement(Registration_Formular_Gender).click();
    }

    public static void Input_Registration_Formular_Firstname()throws Exception{
        driver.findElement(Registration_Formular_Firstname).sendKeys("test");
    }
    public static void Input_Registration_Formular_Lastname()throws Exception{
        driver.findElement(Registration_Formular_Lastname).sendKeys("test");
    }
    public static void Input_Registration_Formular_Email()throws Exception{
        driver.findElement(Registration_Formular_Email).sendKeys("testerselenium11@outlook.com");
    }
    public static void Input_Registration_Formular_Password()throws Exception{
        driver.findElement(Registration_Formular_Password).sendKeys("BosniaPakistan12345");
    }
    public static void Input_Registration_Formular_ConfirmPassword()throws Exception{
        driver.findElement(Registration_Formular_ConfirmPassword).sendKeys("BosniaPakistan12345");
    }
    public static void Input_Registration_Formular_Button()throws Exception{
        driver.findElement(Registration_Formular_Button).click();
    }


    public static void Verify_Logo_On_Header() throws Exception{
        if (driver.findElement(Site_Logo).isDisplayed()){
            System.out.println("Logo is displayed on the Header");
        }
        else{
            throw new Exception("Failed: Logo is not displayed");
        }
    }

    public static void Click_Register_Button() throws Exception{
        driver.findElement(Register_Link).click();
    }

    public static void Click_LogIn_Button() throws Exception{
        driver.findElement(Login_Link).click();
    }

    public static void Click_Shopping_Cart_Button() throws Exception{
        driver.findElement(Shopping_Cart_Link).click();
    }

    public static void Click_Wishlist_Button() throws Exception{
        driver.findElement(Wishlist_Link).click();
    }

    public static void Enter_Value_In_Search_Filed() throws Exception{
        WebElement search_field= driver.findElement(Search_Field);
        search_field.sendKeys("laptop");
        search_field.sendKeys(Keys.ENTER);
    }

    public static void Click_Search_Button() throws Exception{
        driver.findElement(Search_Button).click();
    }

    public static void Email_Input_Textbox() throws Exception{
        driver.findElement(Email_Input_Field).sendKeys("testerselenium11@outlook.com");
    }

    public static void Password_Input_Textbox()throws Exception{
        driver.findElement(Password_Input_Field).sendKeys("BosniaPakistan12345");
    }

    public static void Click_LogIn_Button_For_Login()throws Exception{
        driver.findElement(LogIn_Button).click();
    }

    public static void Verify_User_Is_On_SearchPage() throws Exception{
        String current_url= driver.getCurrentUrl();
        if (current_url.contains("/search?q")){
            System.out.println("The user is on SEARCH PAGE");
        }
        else{
            throw new Exception("TestCase Failed");
        }
    }

}
