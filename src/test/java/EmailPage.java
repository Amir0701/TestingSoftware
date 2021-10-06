import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {
    public WebDriver driver;

    @FindBy(xpath = "//*[contains(@class,'user-pic user-pic_has-plus_ user-account__pic')]")
    private WebElement profile;

    @FindBy(xpath = "//*[contains(@class, 'menu__item menu__item_type_link count-me legouser__menu-item legouser__menu-item_action_passport legouser__menu-item legouser__menu-item_action_passport')]")
    private WebElement manageAccount;

    public EmailPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickProfile(){
        profile.click();
    }

    public void clickManageAccount(){
        manageAccount.click();
    }
}
