import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import javax.swing.*;

public class Test_SpiceJet {
    public static void main(String args[]) throws InterruptedException {

        String pathToChromeDriver = "/Users/nehasingh/work/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(4000);
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       // System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='COK']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".ui-datepicker-current-day")).click();
        Thread.sleep(3000);
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
          System.out.println("it's enabled");
          Assert.assertTrue(false);
        }
        else
            {
                System.out.println("it's disabled");
       Assert.assertTrue(true);
        }

       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        Thread.sleep(3000);
        s.selectByValue("6");
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
//        s.selectByIndex(4);
//        Thread.sleep(2000);
//        s.selectByVisibleText("6");
         Thread.sleep(3000);

        driver.close();
    }
}
