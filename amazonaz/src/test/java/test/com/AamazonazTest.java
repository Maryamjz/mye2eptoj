/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author MARYA
 */
public class AamazonazTest {
    
      private WebDriver driver;
    
    public AamazonazTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         System.setProperty("webdriver.chrome.driver","c:\\data\\chromedriver.exe");
         driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    }
        
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
 @Test
  public void testAmazonAZ() throws Exception {
    driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Faction%3Dsign-out%26ie%3DUTF8%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%26ref_%3Dnav_em_T1_0_1_0_6_signout%26ref_%3Dnavm_em_signin%26ref_%3Dnavm_em_signin%26signIn%3D1%26useRedirectOnSuccess%3D1");
    driver.findElement(By.id("ap_email")).clear();
    driver.findElement(By.id("ap_email")).sendKeys("amazon.it@rambler.ru");
    driver.findElement(By.id("ap_password")).click();
    driver.findElement(By.id("ap_password")).clear();
    driver.findElement(By.id("ap_password")).sendKeys("123456");
    driver.findElement(By.id("signInSubmit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Try Prime'])[2]/following::span[1]")).click();
    driver.findElement(By.name("proceedToCheckout")).click();
    driver.findElement(By.name("placeYourOrder1")).click();
    driver.get("https://www.amazon.com/gp/flex/sign-out.html?action=sign-out&path=%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_em_signin&signIn=1&useRedirectOnSuccess=1&ref_=nav_em_T1_0_1_0_6_signout");
  }


}
