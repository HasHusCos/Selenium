package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Manager {

    public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe"); // En temel haliyle
                                                            // otomasyon yapmak icin Class'imiza otomasyon icin gerekli
                                                            // olan web driver'in yerini gostermek gerekir. Bunun icin
                                                            // java kutuphanesinden System.setProperty() Methodunun
                                                            // icine ilk olarak driver'i yazariz. Ikinci olarak driver'in
                                                            // fiziki yolunu kopyalariz.
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        driver.getTitle(); // Icinde olunan sayfanin basligini string olarak getirir.

        // Burada Slayt'taki methodlara bakacagiz.
    }

}


/*
        Selenium Nedir?
            - Web uygulamalarini farkli tarayicilarda ve uygulamalarda test etmek icin kullanilan ucretsiz bir aractir.
            - Mobil ve Windows testi yapmak icin eklentiler selenium'a eklenebilir.
            - 2021'de poyasaya surulen Selenium4'u ogrenecegiz

        Software Testing Nedir?
            - Expected Result'un Actual Resul'a esit olup olmadiginin kontroludur.
            - Bu esitlik varsa test PASSED olur; esitlik yoksa FAIL oluyor.
            - Her user story icin Positive ve Negative Testler yapilmalidir.
            - Test, musteri ihtiyaclarini karsilamak icin kullanilir.
            - Bir uygulamayi test etmek icin onceden belirlenmis user storyler (kullanici hikayeleri) ve tanimlanmis
              acceptance criterias (kabul kriterleri) dikkate alinir.

        Manuel Testing
            - Herhangi bir otomasyon araci olmadan yapilan testtir.
            - Otomasyon testi yapilmadan once ilk olarak manuel test yapilmalidir.
            - Manuel testte insan hatasi olabilir.
            - Uygulama zamani uzundur.
            - Cok fazla insana ihtiyac duyulur.

        Test Otomasyon
            - Bir tool yardimiyla yapilan teste otomasyon test deniyor.
            - Ayrintili test raporlari olusturulabilir.
            - Testi kaydetmek ve gerektiginde yeniden calistirmak mumkundur.
            - Insan mudahalaesi gerekmeksizin istenilen zamanda calistirmak mumkndur.
            -

        Otomasyon Testi Nedir?
        Basarili bir otomasyon testi icin yapilmasi gerekenler
            - Dogru uygulama secilmelidir.
            - Test yapilacak uygulama hakkinda iyi bilgilere sahip olmak gerekiyor.
            - Test senaryolarini kisa ve bagimsiz tutmalisiniz.
            - Otomasyondan once test verilerini hazirlayin
            - Gerekirse test caselerinizi yonetin ve bakimini yapin. Yeni caselerin eski caseleri bozmadigina emin olun
            - Testlerimizde hata olabilecegini goz onunde bulundurun.

        Selenium
            - Selenium'un 3 tane bileseni vardir.
                1) Web Driver
                2) Selenium Integrated Development Environment IDE
                3) Selenium Grid
            - Calisma Mantigi
            - Selenium'un avantajlari
                - Ucretsiz ve acik kaynakli olmasi
                - Bircok programlama dilini destekler
                - Coklu isletim sistemleri ile calisir.
            - Dezavantajlari
                - Programlama bilgisi gerektirmesi
                - Yalnizca web tabanli uygulamalari test ediyor.
                - Profesyonel destege sahip degil.
            - Selenium'un yapamadiklari
                - Performans Testi yapamiyor.
                - Handle captcha yapamiyor.

            - Test Automation Framework
                - Isimizi rahat yapabilmemiz icin hazirlanmis calisma ortamidir.
                -
 */