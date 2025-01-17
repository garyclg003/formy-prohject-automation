import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/chare/selen/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radiobtn1 = driver.findElement(By.id("radio-button-1"));

        radiobtn1.click();

        WebElement radiobtn2 = driver.findElement(By.cssSelector("input[value='option2']"));

        radiobtn2.click();

        WebElement radiobtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));

        radiobtn3.click();



        driver.quit();
    }
}
