package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webEleSearchPage {

    WebDriver webDriver;

    public By searchBoxTxt = By.id("twotabsearchtextbox");
    public By selectItem = By.xpath("//div[@class='left-pane-results-container']");
}
