package axe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class FrameworkBase
{
    private static WebDriver driver;

    @BeforeTest
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown()
    {
        if(driver != null)
            driver.quit();
    }

    public static WebDriver webDriver()
    {
        return driver;
    }
    public void wiatPageLoad(){

    }
}
