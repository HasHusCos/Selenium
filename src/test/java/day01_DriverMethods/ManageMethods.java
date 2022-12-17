package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        // Sayfayi simge durumuna getirin.
        driver.manage().window().minimize();
        // Simge durumunda 3 saniye bekleyin ve sonrasinda sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize(); // Sayfalarda bazi butonlar sayfa kucukken yer degistirebiliyor.
        Thread.sleep(3000);
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.close();



    }

}
