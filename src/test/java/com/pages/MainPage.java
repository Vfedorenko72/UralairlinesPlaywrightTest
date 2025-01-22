package com.pages;

import com.components.Header;
import com.components.SideNavMenu;
import io.qameta.allure.Step;

import static com.config.ConfigurationManager.config;

public final class MainPage extends BasePage {

    private Header header;
    private SideNavMenu sideNevMenu;

    @Override
    public void initComponents() {
        header = new Header(page);
        sideNevMenu = new SideNavMenu(page);
    }

    @Step("Открытие главной страницы")
    public MainPage open() {
        page.navigate(config().baseUrl());
        return this;
    }
}
