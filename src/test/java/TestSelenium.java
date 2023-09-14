import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestSelenium {
    static WebDriver driver = new HtmlUnitDriver();

    @BeforeClass
    public static void setUp() {
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
    }

    @Test()
    public void login() {
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("accounts.google.com"));
        System.out.println(driver.getTitle());
    }
}