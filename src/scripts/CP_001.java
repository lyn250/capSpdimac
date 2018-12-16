package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.Test;


public class CP_001 {
       static String driverPath = "libs/webdriver/chromedriver.exe";
       static String TipoWebdriver = "webdriver.chrome.driver";
  @Test
  public void chrome() throws InterruptedException {
         System.setProperty(TipoWebdriver, driverPath);
              WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
              
              driver.get("http://testasp.vulnweb.com/");
              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/a[1]")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/a[2]")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/a[3]")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/a[4]")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/a[5]")).click();
              Thread.sleep(2000);
              
             driver.close();
             driver.quit();
  }
}

