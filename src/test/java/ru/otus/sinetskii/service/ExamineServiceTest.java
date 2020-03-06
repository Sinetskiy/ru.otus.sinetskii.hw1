package ru.otus.sinetskii.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.sinetskii.service.ExamineService;
import ru.otus.sinetskii.service.ExamineServiceImpl;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: sinetskii
 * Date: 06.03.2020
 */
@DisplayName("Класс экзамена")
class ExamineServiceTest {
    private ExamineService examineService;

    @BeforeEach
    void setUp() {
        examineService = new ExamineServiceImpl("static/tasks.csv");
    }

    @Test
    @DisplayName("Количество заданий")
    void getTasks() {
        Map<String, String> tasks = examineService.getTasks();

        assertEquals(5, tasks.size());
    }
}