package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public static void Browser_SetUP(String browser_name) throws Exception{
        if (browser_name == "chrome"){
            System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
            driver= new ChromeDriver();
            System.out.println("Opening Chrome Browser");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        else if (browser_name == "firefox"){
            System.setProperty("webdriver.gecko.driver","src/main/resources/Drivers/geckodriver.exe");
            driver= new FirefoxDriver();
            System.out.println("Opening Firefox Browser");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        else if (browser_name == "headless"){
            System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);
        }
        else{
            throw new Exception("Make sure you are entering the correct browser name");
        }

    }

    public static void Redirection_URL(String url){
        driver.navigate().to(url);
    }
}

