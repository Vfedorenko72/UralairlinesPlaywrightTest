package com.components;

import com.microsoft.playwright.Page;

public final class Header extends BaseComponent {

    public Header(final Page page) {
        super(page);
    }

    public void clickOnHamburgerIcon() {
        page.click("//button[@class='sandwich']");
    }
}
