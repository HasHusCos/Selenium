package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");

    }
}
