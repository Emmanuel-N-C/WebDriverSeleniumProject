import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateBrowers   {
    public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/forgot_password");
      /*driver.findElement(By.name("email")).sendKeys("kakij92892@ofacer.com");
      driver.findElement(By.className("radius")).click();*/

      driver.findElement(By.name("username")).sendKeys("tomsmith");
      driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
     driver.findElement(By.id("username")).sendKeys("tomsmith");
      /*driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
      driver.findElement(By.className("radius")).click();*/
      Thread.sleep(4000);
      driver.quit();

    }
}
