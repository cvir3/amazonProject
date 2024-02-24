package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webEleHoverPage {
    WebDriver webDriver;
    public By hoverOnCountry = By.id("icp-nav-flyout");
    public By searchBoxTxt = By.id("twotabsearchtextbox");
    public By selectHindiRadioBtn = By.xpath("//div[@id='nav-flyout-icp']//a[2]//span[1]//i[1]");
    public By selectEnRadioBtn = By.xpath("//div[@id='nav-flyout-icp']//span[contains(@dir,'ltr')][normalize-space()='EN']");
}
