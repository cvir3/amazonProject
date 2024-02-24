package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;

public class baseClass {
    public static WebDriver webDriver;

    @BeforeClass(alwaysRun = true)
    public void setup() throws IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.amazon.in/");
        System.out.println("Page title is " + webDriver.getTitle());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        webDriver.quit();
    }
}
