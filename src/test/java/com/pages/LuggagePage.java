package com.pages;

import com.components.Header;
import com.components.SideNavMenu;
import com.microsoft.playwright.Locator;
import io.qameta.allure.Step;

public final class LuggagePage extends BasePage {

    private Header header;
    private SideNavMenu sideNevMenu;

    @Override
    public void initComponents() {
        header = new Header(page);
        sideNevMenu = new SideNavMenu(page);
    }

    @Step("Получить все типы багажа")
    public Locator getLuggageTypes() {
        return page.locator("//div[@class='title']");
    }
}
