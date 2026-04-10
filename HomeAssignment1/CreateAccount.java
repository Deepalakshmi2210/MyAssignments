package Week2.Day2.HomeAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {
    public static void main(String[] args) {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("https://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA" )).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Deepa");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        driver.findElement(By.id("numberEmployees")).sendKeys("4");
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        WebElement currency = driver.findElement(By.id("currencyUomId"));
        Select options = new Select(currency);
        options.selectByValue("INR");
        driver.findElement(By.id("primaryPhoneNumber")).sendKeys("1234567890");
        driver.findElement(By.className("smallSubmit")).click();
        System.out.println(driver.getTitle());
        driver.close();

    }


}
