package us.biplob;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;

public class TestBase {

    //protected ThreadLocal<WebDriver> threadDriver = null;
    protected ThreadLocal<RemoteWebDriver> threadDriver = null;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @BeforeSuite
    public void startTime(){
        startTime = LocalDateTime.now();


    }
    @BeforeClass
    public void setUp() throws MalformedURLException {

        threadDriver = new ThreadLocal<>();
        ChromeOptions op = new ChromeOptions();
        op.setHeadless(false);
        System.setProperty("webdriver.chrome.driver", "/Users/biplob/Projects/drivers/chromedriver");
        threadDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),op));
        //threadDriver.set(new ChromeDriver());
    }

    public WebDriver getDriver() {
        return threadDriver.get();
    }

    @AfterClass
    public void closeBrowser() {
        getDriver().quit();

    }


    @AfterSuite
    public void endTime() throws MalformedURLException {
        endTime = LocalDateTime.now();

        Duration difference = Duration.between(startTime, endTime);
        System.out.println("================================================");
        System.out.println(" TOTAL TIME TAKEN:    "+ difference.toMillis()/1000 + "  SECONDS");
        System.out.println("================================================");

    }

}
