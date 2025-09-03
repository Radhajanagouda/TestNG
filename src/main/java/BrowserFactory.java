import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserFactory {
    public static WebDriver driver;
    public static void initializeDriver(){
        String browser = "Chrome";// Read from property file
        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.getInstance().setup();
                ChromeOptions options = getChromeOptions();
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                WebDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("The setup are completed for browser");
        }
        DriverManager.setDriver(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public static ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return options;
    }
}
