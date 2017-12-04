import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClientsPage {

    private WebDriver driver;


    @Before
    public void startDriver() {
        System.setProperty("webdriver.gecko.driver", MainClass.getGeckoDriverPath());
        DesiredCapabilities capabilities= DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver= new FirefoxDriver();
    }

    @After
    public void quitDriver() {
        //driver.quit();
    }



    @Test
    public void DublicateNumber(){
        driver.get("http://stage.toplivo.branderstudio.com:8086/admin/base/client-client/list");

        for (int i=0; i<2; i++)
        {
            WebElement addNewButton = driver.findElement(By.cssSelector(".sonata-action-element"));
            addNewButton.click();
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
            WebElement labelPhone = driver.findElement(By.cssSelector(".control-label"));
            labelPhone.click();
            labelPhone.sendKeys("+380991812098");
            WebElement activeCheckBox = driver.findElement(By.cssSelector(".control-label__text"));
            activeCheckBox.click();
            activeCheckBox.click();

            WebElement saveAddNewButton = driver.findElement(By.cssSelector("button.btn:nth-child(3)"));
            saveAddNewButton.click();
        }

        WebElement title = driver.findElement(By.cssSelector(".logo > span:nth-child(2)"));
        title.getText();
    }

    @Test
    public void CorrectPhoneNumberAndEdit(){
        driver.get("http://stage.toplivo.branderstudio.com:8086/admin/base/client-client/list");

        WebElement addNewButton = driver.findElement(By.cssSelector(".sonata-action-element"));
        addNewButton.click();

        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);


        WebElement labelPhone = driver.findElement(By.cssSelector(".control-label"));
        labelPhone.click();
        labelPhone.sendKeys("+380991812099");

        WebElement activeCheckBox = driver.findElement(By.cssSelector(".control-label__text"));
        activeCheckBox.click();
        activeCheckBox.click();

        WebElement saveAddEdit = driver.findElement(By.cssSelector("button.btn:nth-child(1)"));
        saveAddEdit.click();
    }



    @Test
    public void CorrectPhoneNumberAndBackToList(){
        driver.get("http://stage.toplivo.branderstudio.com:8086/admin/base/client-client/list");

        WebElement addNewButton = driver.findElement(By.cssSelector(".sonata-action-element"));
        addNewButton.click();

        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
//        List<WebElement> inputs = driver.findElements(By.tagName("input"));
//        for (WebElement element : inputs) {
//            //System.out.println(element.getCssValue("name"));
//        if (element.getCssValue("id").equals("s5a2521af5ad8a_phone"))
//            element.sendKeys("+380991812099");
//
//        }

        WebElement labelPhone = driver.findElement(By.cssSelector(".control-label"));
        labelPhone.click();
        labelPhone.sendKeys("+380991812099");

        WebElement activeCheckBox = driver.findElement(By.cssSelector(".control-label__text"));
        activeCheckBox.click();
        activeCheckBox.click();

        WebElement saveBackButton = driver.findElement(By.cssSelector("button.btn:nth-child(2)"));
        saveBackButton.click();
    }


    @Test
    public void CorrectPhoneNumberAndAddNew(){
        driver.get("http://stage.toplivo.branderstudio.com:8086/admin/base/client-client/list");

        WebElement addNewButton = driver.findElement(By.cssSelector(".sonata-action-element"));
        addNewButton.click();

        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);


        WebElement labelPhone = driver.findElement(By.cssSelector(".control-label"));
        labelPhone.click();
        labelPhone.sendKeys("+380991812099");

        WebElement activeCheckBox = driver.findElement(By.cssSelector(".control-label__text"));
        activeCheckBox.click();
        activeCheckBox.click();

        WebElement saveAddNewButton = driver.findElement(By.cssSelector("button.btn:nth-child(3)"));
        saveAddNewButton.click();
        
    }






}
