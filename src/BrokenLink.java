import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrokenLink {
@Test
public void testBrokenLink() throws IOException {
	DesiredCapabilities caps=new DesiredCapabilities();
	caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	caps.setCapability(CapabilityType.PLATFORM_NAME, "windows");
	WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/"), caps);
	driver.get("https://www.flipkart.com/");
	List<WebElement> footerlink = driver.findElements(By.xpath("//div[contains(@class,'row')]//a"));
	for(int i=0;i<footerlink.size();i++) {
		String url = footerlink.get(i).getAttribute("href");
		URL u=new URL(url);
	
		HttpURLConnection connection=(HttpURLConnection)u.openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int responseCode = connection.getResponseCode();
		System.out.println(url+"  "+responseCode);
}
}
}
