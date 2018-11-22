import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestTargetWebsite {
	WebDriver dr;
	
	@Given("^Open Brower$")
	public void open_Brower() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/masumparvezapu/Downloads/chromedriver");
		dr = new ChromeDriver();
	}
	@Given("^Navigate to Target URL$")
	public void navigate_to_Target_URL() throws Throwable {
		dr.get("https://www.target.com/");
	}
	@Given("^when user go to Categories$")
	public void when_user_go_to_Categories() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='categories']/span[1]")).click();
	}
	@Given("^when user click on Furniture$")
	public void when_user_click_on_Furniture() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='5xtnr']/a/div")).click();
	}
	@Given("^user click on Living room furniture$")
	public void user_click_on_Living_room_furniture() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='5xtmf']/a/div")).click();
	}
	@Given("^user click on Chairs$")
	public void user_click_on_Chairs() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='5xtlz']/a/div")).click();
	}
	@Given("^user click on Accent Chairs$")
	public void user_click_on_Accent_Chairs() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='4ynw0']/a/div")).click();
	}
	@Then("^user will land on Accent chairs page$")
	public void user_will_land_on_Accent_chairs_page() throws Throwable {
		System.out.println("User is on Accent Chair Page");
		Thread.sleep(3000);
		dr.quit();
	}

}
