package fi.hovukas.spring6di;

import fi.hovukas.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    MyController controller;

    @Test
    void testAutowireController() {
        System.out.println(this.controller.sayHello());
    }

    @Test
    void testGetControllerFromContext() {
        MyController controller = ctx.getBean(MyController.class);

        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {

    }

}
