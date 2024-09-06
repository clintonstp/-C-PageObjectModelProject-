package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;



public class MainSetup {
   private WebDriver driver;
    LandingPage landingPage;
    PageFactoryLessons pageFactoryLessons;


    @BeforeTest
    public void setUpThings(){
      driver = new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }
    @Test(priority = 1)
    public void submitDetails(){
        landingPage = new LandingPage(driver);
        landingPage.gettingHeader();
        landingPage.enterUserName();
        landingPage.enterPassword();
        landingPage.clickOnLogin();

    }
    @Test(priority = 2)
    public void buyStuffs(){
        pageFactoryLessons = new PageFactoryLessons(driver);
        pageFactoryLessons.getTitle();
        pageFactoryLessons.get_back_pack();
        pageFactoryLessons.add_to_cart();
        driver.close();
    }
}
