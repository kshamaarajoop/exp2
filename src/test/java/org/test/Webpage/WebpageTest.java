package org.test.Webpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import static org.testng.Assert.assertTrue;
public class WebpageTest {
    private static WebDriver driver;
    @BeforeTest
    public void openBrowser() throws InterruptedException{
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://kshamaarajoop.github.io/exp2/");
    }
    @Test
    public void TitleValidationTest(){
        String actualTitle= driver.getTitle();
        String expectedTitle = "Ecommerce Demo";
        Assert.assertEquals(actualTitle,expectedTitle);
        assertTrue(true,"Title should be such and such");
    }
    @AfterTest
    public void closeBrowser() throws InterruptedException{
        Thread.sleep(10000);
        driver.quit();
    }
}
