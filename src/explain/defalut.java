package explain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class defalut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\WELCOME\\Downloads\\chromedriver_win32.exe");
		
		 WebDriver driver = new ChromeDriver();
		 System.out.println("hi");
	}

}
