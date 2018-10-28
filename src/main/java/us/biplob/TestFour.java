package us.biplob;

import org.testng.annotations.Test;

public class TestFour extends TestBase{

    @Test
    public void testLink()throws Exception{
        getDriver().get("https://www.youtube.com/");
        System.out.println("====================Test FOUR=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test FOUR=====================");
        Thread.sleep(5000);
    }

    @Test
    public void testLink2()throws Exception{
        getDriver().get("https://www.seleniumconf.us/");
        System.out.println("====================Test FOUR=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test FOUR=====================");
        Thread.sleep(5000);
    }

    @Test
    public void testLink3()throws Exception{
        getDriver().get("https://www.transparency.treasury.gov/");
        System.out.println("====================Test FOUR=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test FOUR=====================");
        Thread.sleep(5000);
    }

    @Test
    public void testLink4()throws Exception{
        getDriver().get("https://www.mabl.com/");
        System.out.println("====================Test FOUR=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test FOUR=====================");
        Thread.sleep(5000);
    }
}
