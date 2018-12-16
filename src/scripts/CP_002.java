package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CP_002 {
	static String driverPath = "libs/webdriver/chromedriver.exe";
    static String TipoWebdriver = "webdriver.chrome.driver";
	
  @Test
  public void f() throws InterruptedException {
	  
	 System.setProperty(TipoWebdriver, driverPath);
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("http://testasp.vulnweb.com/");
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/a[5]")).click();
     Thread.sleep(2000);
          
     driver.findElement(By.id("tfUName")).sendKeys("lortiz");
          
     driver.findElement(By.id("tfRName")).sendKeys("Lynmar");
          
     driver.findElement(By.id("tfEmail")).sendKeys("ext_lortizro@sodimac.cl");
          
     driver.findElement(By.id("tfUPass")).sendKeys("654321");
         
     driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[5]/td[2]/input")).click();
     Thread.sleep(2000);
     
     String titulo= driver.getTitle();
     String resultadoEsperado = "acuforum login44";
     
     Assert.assertEquals(titulo, resultadoEsperado);
     
     driver.close();
     driver.quit();
     
     
  }
}
