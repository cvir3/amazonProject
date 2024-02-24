package testCase;
import function.funHover;
import org.testng.annotations.Test;
import utilities.baseClass;
import java.io.IOException;

public class testHover extends baseClass {

    @Test
    public void testHover() throws InterruptedException, IOException {
        funHover fa = new funHover(webDriver);
        fa.hoverCountryLanguage();
        fa.languageSelect();
    }
}
