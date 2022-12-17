package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com"); //Amazon sayfasina gidelim. https://www.amazon.com/
        System.out.println(driver.getTitle()); // Sayfa basligini(title) yazdirin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title test PASSED");
        }else System.out.println("Title test FAILED"); // Sayfa basliginin “Amazon” icerdigini test edin

        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("amazon")){
            System.out.println("Url Test Passed");
        }else System.out.println("Url Test FAILED"); //Sayfa adresini(url) yazdirin
                                                     //Sayfa url’inin “amazon” icerdigini test edin.
        System.out.println(driver.getWindowHandle()); // Sayfa handle degerini yazdirin
        String source = driver.getPageSource();
        if (source.contains("Gateway")){
            System.out.println("Source test PASSED");
        }else System.out.println("Source test FAILED"); // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin

        driver.close(); // Sayfayi kapatmak icin kullanilir. driver.quit() Methodu ise coklu pencereleri kapatmak icin kullanilir.




    }

}

/*






        Sayfayi kapatin.

 */