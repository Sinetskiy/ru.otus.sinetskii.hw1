package ru.otus.sinetskii.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * User: sinetskii
 * Date: 06.03.2020
 */
public class ExamineServiceImpl implements ExamineService {
    private Map<String, String> questionsAndAnswers = new LinkedHashMap<>();

    ExamineServiceImpl(String fileName) {
        fillQuestionsAndAnswers(fileName);
    }

    private void fillQuestionsAndAnswers(String fileName) {
        try (InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream(fileName)) {

            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()) {
                String[] csvLine = scanner.nextLine().split(",");
                questionsAndAnswers.put(csvLine[0], csvLine[1]);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Map<String, String> getTasks() {
        return questionsAndAnswers;
    }

    @Override
    public void startExamine() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Представтесь пожалуйста:");
        String user = scan.nextLine();

        System.out.println(String.format("Пользователь под именем [%s] начал тест", user));

        int countError = 0;
        int countCorrect = 0;
        for (Map.Entry<String, String> entry : questionsAndAnswers.entrySet()) {
            String s = entry.getKey();
            String s2 = entry.getValue();
            System.out.println(s);
            int number = scan.nextInt();
            if (Integer.valueOf(s2).equals(number)) {
                System.out.println("Correct");
                countCorrect++;
            } else {
                System.out.println("Error");
                countError++;
            }
        }

        scan.close();
        System.out.println(
                String.format("Вы набрали [%s] правильных ответов и [%s] неправильных",
                        countCorrect,
                        countError)
        );
    }
}
