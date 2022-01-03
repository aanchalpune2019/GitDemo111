import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.com/");
		//driver.getTitle(); to get on console sopln used
	    System.out.println(driver.getTitle());
	    //driver.getCurrentUrl(); to check whether same url getting or not (Security Purpose)
	    System.out.println(driver.getCurrentUrl());
        driver.close();  // will close the the current browser
        driver.quit();   //will quit all windows or browers 
	}

}
