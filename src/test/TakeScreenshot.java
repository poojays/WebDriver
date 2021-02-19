package test;

 

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class TakeScreenshot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver", "/home/poojaystecnot/Downloads/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/home/poojaystecnot/Downloads/geckodriver");
        
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
         driver.get("http://demo.guru99.com/test/drag_drop.html");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    TakesScreenshot TSObj = (TakesScreenshot) driver;
    
    
    File image = TSObj.getScreenshotAs(OutputType.FILE);
    
    try {
        FileUtils.copyFile(image, new File("test.png"));
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

 

    }
}
