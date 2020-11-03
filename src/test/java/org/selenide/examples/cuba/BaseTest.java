package org.selenide.examples.cuba;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

abstract class BaseTest {
  @BeforeEach
  protected final void setUp() {
    closeWebDriver();
    open("https://demo10.cuba-platform.com/petclinic/#login");
  }

  protected final void login() {
    $(".username-field").val("joy");
    $(".password-field").val("joy");
    $(".c-login-button").click();
  }
}
