import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
        System.out.println(tableRows.size());
        for (int i = 0; i < tableRows.size(); i++) {
            System.out.println("Row " + (i+1) + ": " + tableRows.get(i).getText());
        }
    }
}
