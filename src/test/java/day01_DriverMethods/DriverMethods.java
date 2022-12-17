package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); // Ilk olarak gitmek istedigimiz sayfayi belirtiriz.
        System.out.println(driver.getTitle()); // driver.getTitle() Methodu, icinde olunan sayfanin basligini verir.
        System.out.println(driver.getCurrentUrl()); // driver.getCurrentUrl() Methodu, icinde olunan sayfanin url'sini verir.
        //System.out.println(driver.getPageSource()); // Sayfanin kaynak kodlarini veriyor.
        System.out.println(driver.getWindowHandle());   // Icinde bulunulan sayfanin hashcode'unu veriyor. Biz bu hash
                                                        // degerlerini bir String'e atayip pencereler arasi gecis yapabiliriz
        //driver.getWindowHandles() // Bu method
    }

}
