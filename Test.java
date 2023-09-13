public class Test {
WebDriver driver = new HtmlUnitDriver();

    @BeforeClass
    public void setUp() {
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
    }

    @Test(testName = "LOGIN", priority = 1, invocationCount = 2)
    public void login() {

        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("accounts.google.com"));
    }
}
