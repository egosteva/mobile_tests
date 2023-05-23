package com.github.egosteva.tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@Tag("android")
public class AndroidWikipediaTests extends TestBase {

    @Test
    @DisplayName("Successful search")
    void successfulSearchTest() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Open article from main page")
    void openArticleFromMainPageTest() {
        step("Click on article header ", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/horizontal_scroll_list_item_text")).click();
        });
        step("Check opening", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/view_news_fullscreen_story_text"))
                        .shouldHave(sizeGreaterThan(0)));
    }
}