import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class myFirstClass {
    public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    String googleTitle = driver.getTitle();
        System.out.println("Google title is "+googleTitle);
      // String googleSource = driver.getPageSource();
        //System.out.println("Google source is :"+googleSource);
    driver.navigate().to("https://www.udemy.com");
        String udemyTitle = driver.getTitle();
        System.out.println("udemy title is "+udemyTitle);
    driver.navigate().back();
    driver.navigate().refresh();
    driver.navigate().forward();
    //Thread.sleep(5000);
    driver.quit();

    }
}
