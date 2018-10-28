package us.biplob;

import org.testng.annotations.Test;

public class TestThree extends TestBase{

    @Test
    public void testLink()throws Exception{
        getDriver().get("https://www.linkedin.com/");
        System.out.println("====================Test THREE=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test THREE=====================");
        Thread.sleep(5000);
    }

    @Test
    public void testLink2()throws Exception{
        getDriver().get("https://www.seleniumconf.us/");
        System.out.println("====================Test THREE=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test THREE=====================");
        Thread.sleep(5000);
    }

    @Test
    public void testLink3()throws Exception{
        getDriver().get("https://www.transparency.treasury.gov/");
        System.out.println("====================Test THREE=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test THREE=====================");
        Thread.sleep(5000);
    }

    @Test
    public void testLink4()throws Exception{
        getDriver().get("https://www.mabl.com/");
        System.out.println("====================Test THREE=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test THREE=====================");
        Thread.sleep(5000);
    }
}
