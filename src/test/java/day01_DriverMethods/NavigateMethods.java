package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        // HepsiBurada sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");
        // Tekrar amazon sayfasina donelim
        driver.navigate().back();
        // Tekrar HepsiBurada sayfasina gidelim
        driver.navigate().forward();
        // Son sayfada sayfayi yenileyelim
        driver.navigate().refresh();
        // Ve sayfayi kapatalim.
        driver.quit();


    }

}

/* NAVIGATE METHODLAR

    - Sayfada geri gitme, ileri gitme, refresh gibi islemler bu method ile yapilabilmektedir. */