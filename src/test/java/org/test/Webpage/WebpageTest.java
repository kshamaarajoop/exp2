package org.test.Webpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import static org.testng.Assert.assertTrue;
public class WebpageTest {
    prive static WebDriver driver;
    @BeforeTest
    public void openBrowser() throws InterruptedException{
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("")
    }
}
