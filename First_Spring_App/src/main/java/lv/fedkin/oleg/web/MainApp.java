package lv.fedkin.oleg.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("WEB-INF/springapp-servlet.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage1();
        obj.getMessage2();
    }
}