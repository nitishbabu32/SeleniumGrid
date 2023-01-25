import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
@Test
public void verifyTitle() throws MalformedURLException {
	DesiredCapabilities caps=new DesiredCapabilities();
	caps.setCapability(CapabilityType.BROWSER_NAME, "MicrosoftEdge");
	//caps.setBrowserName("chrome");
	caps.setCapability(CapabilityType.PLATFORM, "windows");
	WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/"), caps);
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	driver.close();
	
}
}
