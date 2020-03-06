package ru.otus.sinetskii.service;

import ru.otus.sinetskii.dao.PersonDao;
import ru.otus.sinetskii.model.Person;

/**
 * User: sinetskii
 * Date: 06.03.2020
 */
public class PersonServiceImpl implements PersonService {
    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
