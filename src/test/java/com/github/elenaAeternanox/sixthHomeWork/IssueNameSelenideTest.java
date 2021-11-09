package com.github.elenaAeternanox.sixthHomeWork;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.openqa.selenium.By.partialLinkText;

public class IssueNameSelenideTest {

    @Test
    public void checkIssueInGithub() {
        open("https://github.com/elenaAeternaNox");

        // search the repository "qa_quru_sixth_homework"
        $("[name=q]").setValue("qa_quru_sixth_homework").pressEnter();

        // open the repository "qa_quru_sixth_homework"
        $("ul.repo-list li").$("a").shouldHave(href("qa_quru_sixth_homework")).click();

        // open the tab Issues
        $(partialLinkText("Issues")).click();

        // check issue with name "1. Test issue"
        $(byText("1. Test issue")).shouldBe(visible);
    }
}
