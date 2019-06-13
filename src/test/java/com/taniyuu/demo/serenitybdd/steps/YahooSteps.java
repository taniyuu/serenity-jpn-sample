package com.taniyuu.demo.serenitybdd.steps;

import com.taniyuu.demo.serenitybdd.pages.YahooPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class YahooSteps extends ScenarioSteps {
    YahooPage page;
    @Given("Yahoo!JAPANのトップページを開ける")
    public void Yahoo_JAPANのトップページを開ける(){
        page.open();
    }

    @When("スポーツナビのリンクをクリックする")
    public void スポーツナビのリンクをクリックする(){
        page.スポーツナビ.click();
    }

    @Then("ページタイトルが'$pageTitle'である")
    public void ページタイトルを確認する(String pageTitle){
        String actual = page.getTitle();
        assertThat("画面タイトル",actual,is(pageTitle));
    }
}
