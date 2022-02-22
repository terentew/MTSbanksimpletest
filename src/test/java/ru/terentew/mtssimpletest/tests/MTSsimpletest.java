package ru.terentew.mtssimpletest.tests;

import ru.terentew.mtssimpletest.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MTSsimpletest extends TestBase {
    @Test
    @Description("Cashback 5% block")
    @DisplayName("MTS Bank test #1. Cashback 5% block")
    void cashbackTest1() {
        step("Open https://www.mtsbank.ru/ and press %5 cashback ", () -> {
            open("https://www.mtsbank.ru/");
            $("[class='Wrapper-sc-48arcs-1 gZDHeu css-2xbs02']").click();
        });

        step("Check test Рассчитайте свой кэшбэк", () -> {
            $("[data-testid='heading']").shouldHave(text("5% КЕШБЭК НА ПОКУПКИ В СУПЕРМАРКЕТАХ"));
        });
    }

    @Test
    @Description("Credit 5.9% test2")
    @DisplayName("MTS Bank test #2. Credit 5.9%")
    void creditTest2() {
        step("Open https://www.mtsbank.ru/ and press %5 cashback ", () ->
                open("https://www.mtsbank.ru/"));
        step("Set 5000000 credit ", () ->
                $("[id='amount']").setValue("5000000").pressEnter());
        step("Check test Кредит наличными на любые цели от 5,9%", () -> {
            $("[class='Wrapper-sc-6nwvzq-0 kRJvZg styled__LoanMoneyHeading-sc-11amwp8-4 duiEqT']").shouldHave(text("174 848 ₽"));
        });

    }

    @Test
    @Description("Office MTS Bank test3")
    @DisplayName("MTS Bank test #3. Office MTS Bank")
    void officeTest3() {
        step("Open https://www.mtsbank.ru/ofisi-i-bankomati/ and Office MTS Bank ", () ->
                open("https://www.mtsbank.ru/ofisi-i-bankomati/"));
        step("Нажать - отобразить списком", () ->
                $("[class='TabItem-sc-tyqhzb-4 czhqfc']").click());
        step("Check test Офисы МТС", () -> {
            $("[class='Wrapper-sc-6nwvzq-0 dysWGf styled__HeadingWithIndent-sc-1jcx1rf-3 ddYqFJ']").shouldHave(text("Дополнительный офис «На Мясницкой»"));
        });
    }

    @Test
    @Description("Header must have TEXT. Bank test4")
    @DisplayName("MTS Bank test #4.Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.mtsbank.ru/'", () ->
                open("https://www.mtsbank.ru/"));

        step("Page title should have text 'МТС Банк — Кредиты, кредитные карты, вклады | Официальный сайт'", () -> {
            String expectedTitle = "МТС Банк — Кредиты, кредитные карты, вклады | Официальный сайт";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Console errors test. Bank test5")
    @DisplayName("MTS Bank test #5. Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.mtsbank.ru/'", () ->
                open("https://www.mtsbank.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}