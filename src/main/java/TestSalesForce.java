import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.CSS;

public class TestSalesForce {
    public static void main(String args[]) throws InterruptedException{

        String pathToChromeDriver = "/Users/nehasingh/work/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Neha Singh");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#password")).sendKeys("123445667");
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        driver.findElement(By.cssSelector("input#Login")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error")).getText());
        Thread.sleep(3000);
        //driver.findElement()
        driver.close();


    }
}
