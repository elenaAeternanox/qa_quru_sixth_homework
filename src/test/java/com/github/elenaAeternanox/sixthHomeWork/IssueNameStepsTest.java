package com.github.elenaAeternanox.sixthHomeWork;

import com.github.elenaAeternanox.sixthHomeWork.steps.GithubSteps;
import org.junit.jupiter.api.Test;

public class IssueNameStepsTest {

    private static final String PAGE_URL = "https://github.com/elenaAeternaNox";
    private static final String REPOSITORY_NAME = "qa_quru_sixth_homework";
    private static final String TAB_NAME = "Issues";
    private static final String ISSUE_NAME = "1. Test issue";

    private GithubSteps steps = new GithubSteps();

    @Test
    public void checkIssueInGithubBySteps() {
        steps.openPage(PAGE_URL);
        steps.searchRepository(REPOSITORY_NAME);
        steps.openRepository(REPOSITORY_NAME);
        steps.openTab(TAB_NAME);
        steps.checkIssueIsExist(ISSUE_NAME);
    }
}
