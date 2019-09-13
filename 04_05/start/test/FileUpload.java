import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/chare/selen/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUp = driver.findElement(By.id("file-upload-field"));

        fileUp.sendKeys("C:\\Users\\chare\\selen\\Ex_Files_Selenium_EssT\\Exercise Files\\04_05\\start\\file-to-upload.png");


        driver.quit();
    }
}
