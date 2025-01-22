package com.components;

import com.microsoft.playwright.Page;

public final class SideNavMenu extends BaseComponent{

    public SideNavMenu(final Page page) {
        super(page);
    }

    public void clickOnYourLuggage() {
        page.click("//li[@class='uk-active']//a[text()='Ваш багаж']");
    }

}
