package consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DemoService;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("李雷"));
    }
}
