import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static ThreadLocal<WebDriver> ldriver = new ThreadLocal<>();

    // below works awesome when synchronous execution of threads occur, not to be used in parallel
    //below is called singleton is file pattern
//    public static DriverManager getInstance(){
//        if (instance==null){
//            instance = new DriverManager();
//        }`
//        return instance;
//    }

    public static WebDriver getDriver(){
        return ldriver.get();
    }

    public static void setDriver(WebDriver driver){
        ldriver.set(driver);
    }

    public static void unload(){
        ldriver.remove();
    }


}
