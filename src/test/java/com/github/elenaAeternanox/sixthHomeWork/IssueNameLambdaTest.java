package com.github.elenaAeternanox.sixthHomeWork;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.partialLinkText;

public class IssueNameLambdaTest {

    private static final String REPOSITORY_NAME = "qa_quru_sixth_homework";
    private static final String FIRST_ISSUE_NAME = "1. Test issue";
    private static final String SECOND_ISSUE_NAME = "2. Second test issue";

    @Test
    public void checkFirstIssueInGithubByLambda() {
        step("Open the main page", () -> {
            open("https://github.com/elenaAeternaNox");
        });

        step("search the repository 'qa_quru_sixth_homework'", () -> {
            $("[name=q]").setValue(REPOSITORY_NAME).pressEnter();
        });

        step("open the repository 'qa_quru_sixth_homework'", () -> {
            $("ul.repo-list li").$("a").shouldHave(href(REPOSITORY_NAME)).click();
        });

        step("open the tab Issues", () -> {
            $(partialLinkText("Issues")).click();
        });

        step("check issue with name '1. Test issue'", () -> {
            $(byText(FIRST_ISSUE_NAME)).shouldBe(visible);
        });
    }

    @Test
    public void checkSecondIssueInGithub() {
        step("Open the main page", () -> {
            open("https://github.com/elenaAeternaNox");
        });

        step("search the repository 'qa_quru_sixth_homework'", () -> {
            $("[name=q]").setValue(REPOSITORY_NAME).pressEnter();
        });

        step("open the repository 'qa_quru_sixth_homework'", () -> {
            $("ul.repo-list li").$("a").shouldHave(href(REPOSITORY_NAME)).click();
        });

        step("open the tab Issues", () -> {
            $(partialLinkText("Issues")).click();
        });

        step("check issue with name '1. Test issue'", () -> {
            $(byText(SECOND_ISSUE_NAME)).shouldBe(visible);
        });
    }
}
