package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Config {
  public static String driverType= System.getProperty("browser");
  public static String url;

 @Before
    public void beforeEachTest(){
  driver =setupBrowser(driverType);
    url = "https://www.macys.com/account/signin";

 }
 @After
 public void afterEachTest(Scenario scenario){
     try{
         if(scenario.isFailed()){
             final byte[] screenshot = ((TakesScreenshot) driver)
                     .getScreenshotAs(OutputType.BYTES);
             scenario.attach(screenshot, "image/png", scenario.getName()); //stick it in the report
         }

}finally {

         driver.quit();
     }
     }}
