package tests;

import org.testng.annotations.Test;
import axe.AccessibilityBase;
import axe.FrameworkBase;

import java.io.IOException;

public class Login extends FrameworkBase {
    AccessibilityBase a11y;

    @Test
    public void testLogin() throws IOException {
        webDriver().get("https://digitalhml.hdevelo.com.br/login/");
        a11y.checkAccessibilityViolations();
    }

}
