package com.syntax.Task04;

public interface WebDriver {
    void open();
    void close();
    String getTitle(String name);
}
interface TakeScreenShot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakeScreenShot{
    void navigate();
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Safari browser");
    }
    @Override
    public void close() {
        System.out.println("Close Safari browser");
    }
    @Override
    public String getTitle(String name) {
        return name;
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Safari browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking a screenshot of Safari browser");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox browser");
    }

    @Override
    public String getTitle(String name) {
        return name;
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Firefox browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking a screenshot of Firefox browser");
    }
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("Open Google Chrome browser");
    }
    @Override
    public void close(){
        System.out.println("Close Google Chrome browser");
    }
    @Override
    public String getTitle(String name){
        return name;
    }
    @Override
    public void navigate(){
        System.out.println("Navigate to Google Chrome browser");
    }
    @Override
    public void getScreenshot(){
        System.out.println("Taking a screenshot of Google Chrome browser");
    }
}
