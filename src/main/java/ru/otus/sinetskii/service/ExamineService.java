package ru.otus.sinetskii.service;

import java.util.Map;

/**
 * User: sinetskii
 * Date: 06.03.2020
 */
public interface ExamineService {
    Map<String, String> getTasks();

    void startExamine();
}
