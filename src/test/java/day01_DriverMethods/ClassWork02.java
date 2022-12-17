package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork02 {

    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Bu method, sayfadaki her bir webelement
                                                                           // icin max bekleme suresini belirler.
        driver.get("https://facebook.com");
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        Thread.sleep(3000);
        if (actualTitle.equals("facebook")){
            System.out.println("Title test PASSED");
        }else System.out.println("Title test FAILED");
        Thread.sleep(3000);
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")) {
            System.out.println("Url Test PASSED");
        }else System.out.println("Url Test FAILED");
        Thread.sleep(3000);
        driver.get("https://walmart.com");
        String actualTitleWallmart = driver.getTitle();
        if (actualTitleWallmart.contains("Walmart.com")){
            System.out.println("Title Test PASSED");
        }else System.out.println("Title Test FAILED");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();


    }

}
