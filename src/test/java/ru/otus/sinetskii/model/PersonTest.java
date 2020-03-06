package ru.otus.sinetskii.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.sinetskii.model.Person;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: sinetskii
 * Date: 06.03.2020
 */
@DisplayName("Класс Person")
class PersonTest {

    @DisplayName("корректно создается конструктором")
    @Test
    void shouldHaveCorrectConstructor() {
        Person person = new Person("Ivan", 42);

        assertEquals("Ivan", person.getName());
        assertEquals(42, person.getAge());
    }

    @DisplayName("корректно создается конструктором 2")
    @Test
    void shouldHaveCorrectConstructor2() {
        Person person = new Person("Ivan", 42);

        assertAll(
                () -> assertEquals("Ivan", person.getName()),
                () -> assertEquals(42, person.getAge())
        );
    }
}