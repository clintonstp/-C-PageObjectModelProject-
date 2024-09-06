package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPage {

    private WebDriver driver;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    By header = By.className("login_logo");
    By userName = By.id("user-name");
    By password = By.id("password");
    By submitButton = By.id("login-button");



        public void gettingHeader(){
            String getHeader = driver.findElement(header).getText();
            Assert.assertEquals("Swag Labs", getHeader);
        }
        public void enterUserName() {
            driver.findElement(userName).sendKeys("standard_user");
        }

        public void enterPassword() {
            driver.findElement(password).sendKeys("secret_sauce");
        }
        public void clickOnLogin() {
            driver.findElement(submitButton).click();
        }
    }
