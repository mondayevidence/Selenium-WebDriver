package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class DynamicLoadingPage {
    private WebDriver driver;
    private By link_Example1 = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]");
    private By lin_Example2 = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[2]");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(lin_Example2);
        return  new DynamicLoadingExample2Page(driver);
    }
    public DynamicLoadingExample2Page rightClickOnExample2Link(){
        driver.findElement(lin_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }
}
