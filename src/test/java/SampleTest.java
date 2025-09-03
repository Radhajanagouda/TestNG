import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    @Test
    public void orangeHrmValidateLandingPage() throws InterruptedException {
        WebDriver driver  = DriverManager.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
    }

    @Test
    public void googleValidateLandingPage() throws InterruptedException {
        WebDriver driver  = DriverManager.getDriver();
        driver.get("http://www.google.com");
        Thread.sleep(1000);
    }
}
