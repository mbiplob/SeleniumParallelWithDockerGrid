package us.biplob;

import org.testng.annotations.Test;

public class TestOne extends TestBase{

    @Test
    public void testLink()throws Exception{
        getDriver().get("http://facebook.com");
        System.out.println("====================Test ONE=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test ONE=====================");
        getDriver().getCurrentUrl();
        Thread.sleep(5000);
    }

    @Test
    public void testLink2()throws Exception{
        getDriver().get("https://www.seleniumconf.us/");
        System.out.println("====================Test ONE=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test ONE=====================");
        getDriver().getCurrentUrl();
        Thread.sleep(5000);
    }


    @Test
    public void testLink3()throws Exception{
        getDriver().get("https://www.transparency.treasury.gov/");
        System.out.println("====================Test ONE=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test ONE=====================");
        getDriver().getCurrentUrl();
        Thread.sleep(5000);
    }


    @Test
    public void testLink4()throws Exception{
        getDriver().get("https://www.mabl.com/");
        System.out.println("====================Test ONE=====================");
        System.out.println( getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        System.out.println("====================Test ONE=====================");
        getDriver().getCurrentUrl();
        //Assert.assertEquals(getDriver().getTitle(), "biplob.us");

        Thread.sleep(5000);
    }
}