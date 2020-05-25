import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class RahulShetty {
    public static void main(String args[]) throws InterruptedException {

        String pathToChromeDriver = "/Users/nehasingh/work/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("[id='name']")).sendKeys("Neha Singh");
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
         Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
         Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.close();
    }

}
