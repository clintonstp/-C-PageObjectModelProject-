package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageFactoryLessons {
    WebDriver driver;
    @FindBy(className = "app_logo")
    WebElement title;
    @FindBy(id = "item_4_title_link")
    WebElement back_pack;
    @FindBy(className = "header_container")
    WebElement add_to_cart;

    public PageFactoryLessons(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public void getTitle(){
        String get_title = title.getText();
        Assert.assertEquals(get_title,"Swag Labs");
    }
    public void get_back_pack(){
        back_pack.click();
    }
    public void add_to_cart(){
        add_to_cart.click();
    }

}
