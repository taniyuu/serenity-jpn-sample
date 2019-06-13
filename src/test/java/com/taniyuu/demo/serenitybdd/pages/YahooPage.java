package com.taniyuu.demo.serenitybdd.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.yahoo.co.jp/")
public class YahooPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"yahooservice\"]/ul/li[9]/a")
    public WebElementFacade スポーツナビ;
}
