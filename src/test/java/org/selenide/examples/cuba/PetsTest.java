package org.selenide.examples.cuba;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PetsTest extends BaseTest {
  @Test
  void pets() {
    login();

    $(".c-sidemenu").find(byText("Pets")).click();
    $(".v-tabsheet-tabs .v-tabsheet-tabitem.v-tabsheet-tabitem-selected").shouldHave(text("Pets"));
    $(".c-table-rows-count").shouldHave(exactText("24 rows"));
    $$(".v-tabsheet-content .v-tabsheet-tabsheetpanel .v-table-table tr").shouldHave(size(24));
    $(".v-tabsheet-content .v-tabsheet-tabsheetpanel .v-table-table tr", 7).shouldHave(
        text("Cubone"), text("104"), text("11/09/1998"), text("Jessie"), text("Normal"), text("Kanto (Gen 1)")
    );
  }
}
