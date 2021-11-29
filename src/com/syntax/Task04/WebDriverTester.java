package com.syntax.Task04;

public class WebDriverTester {
    public static void main(String[] args) {
        SafariDriver safariDriver = new SafariDriver();
        safariDriver.open();
        safariDriver.navigate();
        System.out.println(safariDriver.getTitle("Safari"));
        safariDriver.getScreenshot();
        safariDriver.close();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.open();
        firefoxDriver.navigate();
        System.out.println(firefoxDriver.getTitle("Firefox"));
        firefoxDriver.getScreenshot();
        firefoxDriver.close();

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.open();
        chromeDriver.navigate();
        System.out.println(chromeDriver.getTitle("Google Chrome"));
        chromeDriver.getScreenshot();
        chromeDriver.close();


    }

}