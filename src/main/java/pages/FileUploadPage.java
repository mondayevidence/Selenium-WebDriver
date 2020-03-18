package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputFiled = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    /**
    * This provides the path of the file to the form then clicks Upload
    * Button.
     * @param absolutePathOfFile is the complete path of the file to
     *             upload
     */

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputFiled).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }
    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }
}
