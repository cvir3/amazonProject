package function;

import elements.webEleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.baseClass;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class funSearch extends baseClass {
    WebDriver webDriver;
    webEleSearchPage ele_s = new webEleSearchPage();

    /* This is Constructor */
    public funSearch(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }

    public void searchItem() throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        WebElement searchBox = webDriver.findElement(ele_s.searchBoxTxt);
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys("Iphone");
        //searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        List<WebElement> list = webDriver.findElements(By.xpath("(//div[@class='s-suggestion-container'])[4]"));
        System.out.println("Find Text::===>" + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("iphone 15 plus")) {
                list.get(i).click();
                //break;
            }
        }
    }
}

