package stepDefinitions;

import DriversManage.GridDriverMethods;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_02 {

    static WebDriver driver;

    GridDriverMethods driverMethods = new GridDriverMethods();


    @Test
    void chromeCapabilitiesTest(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setPlatform(Platform.ANY); // selected OS
        capabilities.setBrowserName("chrome"); // selected Browser
        capabilities.setVersion("133.0.6943.98"); // Selected version

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(capabilities);

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.100.219:4444"), chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }



    @Test
    void chromeTest(){

        driver = driverMethods.setUpChromeDriver();

        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @Test
    void firefoxTest(){

        driver = driverMethods.setUpFirefoxTest();

        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @Test
    void edgeTest(){

        driver = driverMethods.setUpEdgeTest();

        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

}
