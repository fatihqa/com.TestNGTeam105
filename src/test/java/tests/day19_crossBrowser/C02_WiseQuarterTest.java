package tests.day19_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C02_WiseQuarterTest extends TestBaseCross {

    @Test
    public void test01(){
        //Wisequarter anasyfasına gidelim
        driver.get("https://www.wisequarter.com");
        //wise quarter sitesine gittigimizi test edelim
        String actUrl= driver.getCurrentUrl();
        String  expKelime="wisequarter";

        Assert.assertTrue(actUrl.contains(expKelime));

    }
}
