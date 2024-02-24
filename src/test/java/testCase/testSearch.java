package testCase;
import function.funSearch;
import org.testng.annotations.Test;
import utilities.baseClass;
import java.io.IOException;

public class testSearch extends baseClass {
    @Test
    public void testSearch() throws InterruptedException, IOException {
        funSearch fs = new funSearch(webDriver);
        fs.searchItem();

    }
}
