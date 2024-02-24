package function;

import elements.webEleHoverPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.baseClass;

import java.io.IOException;
import java.time.Duration;

public class funHover extends baseClass {
    WebDriver webDriver;
    webEleHoverPage ele_h = new webEleHoverPage();

    /* This is Constructor */
    public funHover(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }
    public void hoverCountryLanguage() throws IOException, InterruptedException {
        Actions action = new Actions(webDriver);
        WebElement element = webDriver.findElement(ele_h.hoverOnCountry);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
    }
    public void languageSelect() throws IOException, InterruptedException{
        webDriver.findElement(ele_h.selectHindiRadioBtn).click();
        Thread.sleep(500);
        hoverCountryLanguage();
        Thread.sleep(500);
        webDriver.findElement(ele_h.selectEnRadioBtn).click();
    }
}
