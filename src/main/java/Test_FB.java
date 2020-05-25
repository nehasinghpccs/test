import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_FB {
    public static void main(String args[]) throws InterruptedException {

        String pathToChromeDriver = "/Users/nehasingh/work/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        ChromeDriver driver = new ChromeDriver();

        //driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.get("https://www.facebook.com/");
        //driver.navigate().back();
        Thread.sleep(1000);
        //driver.navigate().forward();
        driver.findElement(By.id("email")).sendKeys("nehasinghpccs");
        Thread.sleep(1000);
        driver.findElement(By.name("pass")).sendKeys("1234pas");
        Thread.sleep(1000);
       // driver.findElementByLinkText("Forgot account?").click();
        //driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(4000);
        driver.close();


    }
}
