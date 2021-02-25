package test;

import java.util.concurrent.TimeUnit;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class GridExample {

	public static void main(String[] args)throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities obj= new DesiredCapabilities();
		
		obj.setPlatform(Platform.LINUX);
		obj.setBrowserName("chrome");
		
		String HubURL="http://172.17.0.1:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(HubURL),obj);
		driver.get("https://www.simplileran.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}

}
