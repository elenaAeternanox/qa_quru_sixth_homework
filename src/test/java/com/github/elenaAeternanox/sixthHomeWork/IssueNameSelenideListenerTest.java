package com.github.elenaAeternanox.sixthHomeWork;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.partialLinkText;

public class IssueNameSelenideListenerTest {

    @Test
    public void checkIssueInGithubWithListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/elenaAeternaNox");

        $("[name=q]").setValue("qa_quru_sixth_homework").pressEnter();
        $("ul.repo-list li").$("a").shouldHave(href("qa_quru_sixth_homework")).click();
        $(partialLinkText("Issues")).click();

        $(byText("1. Test issue")).shouldBe(visible);
    }
}
