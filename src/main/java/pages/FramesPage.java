package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By clickNested = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public NestedFramePage clickNestedLink(){
        driver.findElement(clickNested).click();
        return new NestedFramePage(driver);
    }

}
