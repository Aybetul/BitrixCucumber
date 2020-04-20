package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPage extends BasePage {
    @FindBy(id="feed-add-post-form-tab-calendar")
    protected WebElement eventTab;
    @FindBy(id="blog-submit-button-save")
    protected WebElement send;
    @FindBy(css = "[id^='feed-cal-event-namecal']")
    protected WebElement eventName;

    public WebElement getEventName() {
        return eventName;
    }

    public void clickEventTab() {
       eventTab.click();
    }

    public void clickSend() {
        send.click();
    }

    public WebElement getSend() {
        return send;
    }

    public void getEventName(String event_name) {
        eventName.sendKeys(event_name);
    }

    public void sendEventDetails(String s){
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='bx-html-editor-ta-cnt-oCalEditorcal_3Jcl']/..//div//iframe")));
        driver.findElements(By.cssSelector("[contenteditable='true']")).get(0).sendKeys("event details...");
        driver.switchTo().defaultContent();


    }
}
