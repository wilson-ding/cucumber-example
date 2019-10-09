import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {

    String usename;
    String password;
//    ChromeDriver driver = new ChromeDriver();
    @Given("^username and password are ready$")
    public void givenStatement() {
//        System.out.println("Given statement executed successfully" + a);
        usename = "vonmailcheck@gmail.com";
        password = "voncheck";
    }

    @When("^try to login$")
    public void whenStatement(){
        System.out.println("Login ...");
        System.setProperty("webdriver.chrome.driver", "/Users/zding/Intellij-CE-2/tools/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin");
        driver.findElement(By.id("identifierId")).sendKeys(usename);

        WebDriverWait wait=new WebDriverWait(driver, 50L);

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));

//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //not working ??
//        sleepFor(1000);

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

//        sleepFor(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("totpPin")));
        driver.findElement(By.id("totpPin")).sendKeys("123456");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='RveJvd snByac']")));
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

        System.out.println("xyz" + driver.findElement(By.id("totpPin")).getAttribute("data-initial-value"));
    }

    @Then("^login successfully$")
    public void thenStatement(){
        System.out.println("Then statement executed successfully");
    }


    private void sleepFor(Integer millisec){
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/zding/Intellij-CE-2/tools/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }*/