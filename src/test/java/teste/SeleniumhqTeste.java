package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumhqTeste {

	private WebDriver driver;
	String grava;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://seleniumhq.org");
		assertEquals("Selenium - Web Browser Automation", driver.getTitle());
		Thread.sleep(3000);
		grava = driver.getTitle();
		System.out.println("Título da pagina: " + grava);

	}

}
