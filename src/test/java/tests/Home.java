package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import axe.AccessibilityBase;
import axe.FrameworkBase;

import java.io.IOException;

public class Home extends FrameworkBase {

    AccessibilityBase a11y;

    @Test
    public void testHome() throws IOException, InterruptedException {

        webDriver().get("https://digitalhml.hdevelo.com.br/login/");
        webDriver().findElement(By.id("loginMain")).sendKeys("67580858053");
        webDriver().findElement(By.xpath("//flui-button")).click();
        webDriver().findElement(By.xpath("//input[@id='loginPassword']")).sendKeys ("199011");
        Thread.sleep(1000);
        webDriver().findElement(By.xpath("//*[@id='loginSubmit']//parent::flui-button")).click();
        waitPageLoad();
        a11y.checkAccessibilityViolations();
    }
}
