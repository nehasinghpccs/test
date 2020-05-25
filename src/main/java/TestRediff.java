import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRediff {

    public static void main(String args[]) throws InterruptedException{

        String pathToChromeDriver = "/Users/nehasingh/work/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Neha");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[title*='Sign in']")).click();
        Thread.sleep(2000);
        driver.close();
    }

}


