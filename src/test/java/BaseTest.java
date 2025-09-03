import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeMethod
    public void setUp(){
        BrowserFactory.initializeDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        WebDriver driver = DriverManager.getDriver();
        if(driver!=null){
            System.out.println("Closing browser on Thread: " + Thread.currentThread().getId());
            try{
                driver.quit();
            }
            finally{
                DriverManager.unload();
            }
        }
    }
}
