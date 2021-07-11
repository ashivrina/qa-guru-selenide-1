package com.ashivrina;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindSoftAssertionsTest {

    @BeforeAll
    static void setUp() {
        Configuration.startMaximized = true;
    }

    @Test
    void softAssertionsHasJUnitCode() {
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        // - Перейти в раздел Wiki проекта
        $(byText("Wiki")).click();

        // - Убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-box").$("ul").$(".js-wiki-more-pages-link").click();
        $(byText("SoftAssertions")).shouldBe(visible);

        // - Открыть страницу SoftAssertions, проверить, что внутри есть пример кода для JUnit5
        $(byText("SoftAssertions")).click();
        $(byText("Using JUnit5 extend test class:")).shouldBe(visible);
    }

}
