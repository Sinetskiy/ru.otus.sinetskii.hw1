package ru.otus.sinetskii.dao;

import ru.otus.sinetskii.model.Person;

/**
 * User: sinetskii
 * Date: 06.03.2020
 */
public interface PersonDao {
    Person findByName(String name);
}
