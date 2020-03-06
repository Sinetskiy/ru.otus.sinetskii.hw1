package ru.otus.sinetskii.dao;

import ru.otus.sinetskii.model.Person;

/**
 * User: sinetskii
 * Date: 06.03.2020
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public Person findByName(String name) {
        return new Person(name, 24);
    }
}
