import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/chare/selen/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("913 Pintail ct. Canton Ga. 30115");

        Thread.sleep(1000);


        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();

        driver.quit();
    }
}
