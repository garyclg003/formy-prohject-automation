import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/chare/selen/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement box = driver.findElement(By.id("box"));

        WebElement image = driver.findElement(By.id("image"));

        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.dragAndDrop(image, box).build().perform();
        Thread.sleep(1000);
        driver.quit();
    }
}

