package ru.otus.sinetskii.service;

import ru.otus.sinetskii.model.Person;

/**
 * User: sinetskii
 * Date: 06.03.2020
 */
public interface PersonService {
    Person getByName(String name);
}
