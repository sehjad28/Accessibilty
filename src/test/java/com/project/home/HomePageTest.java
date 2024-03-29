package com.project.home;

import com.project.pages.home.HomePage;
import com.testautomation.ui.base.BaseTest;
import com.testautomation.ui.reporting.TestListener;
import com.testautomation.ui.security.ZapScan;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ TestListener.class })
public class HomePageTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void test() throws Exception {
       // String my_url = "https://www.hackthissite.org/";
        String my_url = "http://php.testsparker.com";
      //String my_url = "http://192.168.0.109/WackoPicko/";
        //page.getPageInstance(HomePage.class).gotoSite("https://customer.qa.accelerate.cinchhs.com/account");
        page.getPageInstance(HomePage.class).gotoSite(my_url);
        Thread.sleep(6000);
        CustomSoftAssert.axeSoftAssert(CheckAxe.checkAxe(driver), softAssert);
        softAssert.assertAll();



    }


}
