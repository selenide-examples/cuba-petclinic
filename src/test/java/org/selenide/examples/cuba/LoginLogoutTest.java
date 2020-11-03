package org.selenide.examples.cuba;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginLogoutTest extends BaseTest {
  @Test
  void userCanLoginAndLogout() {
    login();

    $(".c-userindicator .c-user-select-label").shouldHave(text("Nurse Joy"));

    $(".c-logout-button").click();
    $(".c-userindicator").shouldNot(exist);
  }
}
