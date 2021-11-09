package com.github.elenaAeternanox.sixthHomeWork.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.partialLinkText;

public class GithubSteps {

    @Step("Open the main page {link}")
    public void openPage(String link) {
        open(link);
    }

    @Step("Search the repository {repository}'")
    public void searchRepository(String repository) {
        $("[name=q]").setValue(repository).pressEnter();
    }

    @Step("Search the repository {repository}'")
    public void openRepository(String repository) {
        $("ul.repo-list li").$("a").shouldHave(href(repository)).click();
    }

    @Step("open the {tabName}")
    public void openTab(String tabName) {
        $(partialLinkText(tabName)).click();
    }

    @Step("check issue with name {issueName}")
    public void checkIssueIsExist(String issueName) {
        $(byText(issueName)).shouldBe(visible);
    }
}
