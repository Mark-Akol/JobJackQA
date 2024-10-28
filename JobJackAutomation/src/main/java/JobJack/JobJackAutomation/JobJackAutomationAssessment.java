package JobJack.JobJackAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;

public class JobJackAutomationAssessment {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
    	System.setProperty("webdriver.chrome.driver", "C:/Users/STEVE BIIKO/Documents/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        try {
            // Step 1: Open www.jobjack.co.za
            driver.get("https://www.jobjack.co.za");

            // Step 2: Navigate to the “Job Seeker” page
            WebElement jobSeekerLink = driver.findElement(By.linkText("Job Seeker"));
            jobSeekerLink.click();

            // Step 3: Select “Find A Job”
            WebElement findAJobLink = driver.findElement(By.linkText("Find A Job"));
            findAJobLink.click();

            // Step 4: Fill in the Sign Up page
            WebElement firstName = driver.findElement(By.id("first_name")); // Replace with actual ID
            firstName.sendKeys("Job"); // Actual information tested
            WebElement lastName = driver.findElement(By.id("last_name")); // Replace with actual ID
            lastName.sendKeys("Jack");// Actual information tested
            WebElement mobileNumber = driver.findElement(By.id("mobile")); // Replace with actual ID
            mobileNumber.sendKeys("0123456789"); // Actual information tested
            WebElement whatsappNumber = driver.findElement(By.id("whatsapp")); // Replace with actual ID
            whatsappNumber.sendKeys("0123456789"); // Actual information tested
            WebElement notifications = driver.findElement(By.id("notifications")); // Replace with actual ID
            notifications.click(); // click on element
            WebElement email = driver.findElement(By.id("email")); // Replace with actual ID
            String uniqueEmail = "job.jack" + System.currentTimeMillis() + "@gmail.com"; // Unique email
            email.sendKeys(uniqueEmail);
            WebElement location = driver.findElement(By.id("location")); // Replace with actual ID
            location.sendKeys("South Africa, Bellville, Bellville Park"); // Actual information tested
            WebElement password = driver.findElement(By.id("password")); // Replace with actual ID
            String passwordValue = "Register"; // Using the word "Register" as the password
            password.sendKeys(passwordValue);
            System.out.println("Password: " + passwordValue); // Display intended password 
            WebElement referralSource = driver.findElement(By.id("referral")); // Replace with actual ID
            referralSource.sendKeys("Radio"); // Actual information tested

            // Step 5: Pause for 30 seconds
            Thread.sleep(30000);

            // Step 6: Select “Register”
            WebElement registerButton = driver.findElement(By.id("register")); // Replace with actual ID
            registerButton.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 7: Stop the driver
            driver.quit();
        }
    }
}