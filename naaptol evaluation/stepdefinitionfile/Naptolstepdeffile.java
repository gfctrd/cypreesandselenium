package naaptolevaluation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Naptolstepdeffile {
	WebDriver driver;
	@Given("i launch naaptol website")
	public void i_launch_naaptol_website() {
	    driver=new ChromeDriver();
	    driver.get("https://www.naaptol.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	   driver.findElement(By.xpath("//a[@id='login-panel-link']")).click();
	   
	}

	@And("I enter phone number")
	public void i_enter_phone_number() {
	  WebElement num = driver.findElement(By.xpath("//input[@id='registration-basic-panel-mobile']"));
	   num.sendKeys("9177838628");
	}

	@And("click on continue")
	public void click_on_continue() {
	    driver.findElement(By.xpath("//input[@id='registration-basic-panel-submit']")).click();
	}
	
	@And("submit the otp")
	public void submit_the_otp() {
	   driver.findElement(By.xpath("//input[@id='registration-otp-panel-submit']")).click();
	}


	@And("navigate to home and kitchen section")
	public void navigate_to_home_and_kitchen_section() {
		
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement category = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cate_head']")));
		    Actions actions = new Actions(driver);
		    actions.moveToElement(category).perform();

		    
		    WebElement homekitchenlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Home & Kitchen']")));

		    
		    JavascriptExecutor js =(JavascriptExecutor) driver;
		    js.executeScript("arguments[0].click();", homekitchenlink);
	}

	@And("slected the product")
	public void slected_the_product() {
	    driver.findElement(By.xpath("//img[@src='//images.naptol.com/usr/local/csp/staticContent/product_images/horizontal/185x185/4PC3-1.jpg']")).click();
	}

	@And("I click on buy")
	public void i_click_on_buy() {
	 driver.findElement(By.xpath("//a[@id='cart-panel-button-0']")).click();
	 
	}

	@And("enter firstname")
	public void enter_firstname() {
	   WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name*']"));
	    firstname.sendKeys("Mahesh");
	}

	@And("enter lastname")
	public void enter_lastname() {
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name*']"));
	    lastname.sendKeys("reddy");
	}

	@And("enter mobile number")
	public void enter_mobile_number() {
	  WebElement number = driver.findElement(By.xpath("//input[@placeholder='Mobile Number*']"));
	   number.sendKeys("9951120448");
	}

	@And("enter address")
	public void enter_address() {
	   WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Complete Address*']"));
	   address.sendKeys("123 near metro, moosapet, hyderabad");
	}

	@And("enter landmark")
	public void enter_landmark() {
	   driver.findElement(By.xpath("//input[@placeholder='Landmark']")).sendKeys("moosapet metro");
	}

	@And("enter pincode")
	public void enter_pincode() {
	   driver.findElement(By.xpath("//input[@placeholder='Pincode*']")).sendKeys("500085");
	}

	@And("select state")
	public void select_state() {
	   WebElement drpdown = driver.findElement(By.xpath("//select[@id='state']"));
	   Select selectstate = new Select(drpdown);
	   selectstate.selectByVisibleText("TELANGANA");
	}

	@And("select city")
	public void select_city() {
		WebElement drpdown = driver.findElement(By.xpath("//select[@id='state']"));
		   Select selectcity= new Select(drpdown);
		   selectcity.selectByVisibleText("HYDERABAD");
	}

	@And("click on complete order")
	public void click_on_complete_order() {
	   driver.findElement(By.xpath("//button[text()='COMPLETE ORDER']")).click();
	}

	@Then("I see order confirmation meassage")
	public void i_see_order_confirmation_meassage() {
	   System.out.println("Thank you for shopping with Naaptol.");
	}

}
