package org.selenide.examples.cuba;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PreferencesTest extends BaseTest {
  @Test
  void preferences() {
    login();

    $(".c-settings-button").click();
    $(".v-tabsheet-tabs .v-tabsheet-tabitemcell .v-tabsheet-tabitem")
        .shouldHave(cssClass("v-tabsheet-tabitem-selected"), text("Settings"));

    $(byText("Default screen"))
        .closest(".v-gridlayout-slot")
        .sibling(0)
        .find(".v-filterselect .v-filterselect-button").click();
  }
}
