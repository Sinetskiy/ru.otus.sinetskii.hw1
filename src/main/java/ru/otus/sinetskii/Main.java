package ru.otus.sinetskii;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.sinetskii.model.Person;
import ru.otus.sinetskii.service.PersonService;
import ru.otus.sinetskii.service.ExamineService;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		PersonService bean = context.getBean(PersonService.class);
		Person ivan = bean.getByName("Ivan");
		System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());

		ExamineService examineService = context.getBean(ExamineService.class);
		System.out.println(examineService.getTasks());

		examineService.startExamine();
	}

}
