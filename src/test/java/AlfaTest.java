import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlfaTest {

@Test
    void shouldSendRequest () {
    open("http://localhost:7777");
    SelenideElement form = $(".form");
    form.$("[data-test-id=name] input").setValue("Ермошина Ульяна");
    form.$("[data-test-id=phone] input").setValue("+79655657251");
    form.$("[data-test-id=agreement]").click();
    form.$(".button").click();
    $(".paragraph.paragraph_theme_alfa-on-white").shouldHave(text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
}

}