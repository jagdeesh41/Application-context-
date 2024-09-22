package com.jagadeesh.learning;

import com.jagadeesh.learning.config.BeanConfigurations;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{



    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurations.class);
        var car = context.getBean(Car.class);
        log.info(car.getName());
        var hello = context.getBean("helloWorld",String.class);
        log.info(hello);
        var helloFromAudi = context.getBean("helloWorldFromAudiQ8",String.class);
        log.info(helloFromAudi);
        var number = context.getBean("number",Integer.class);
        log.info("{}",number);
        var car1= context.getBean("audi",Car.class);
        log.info("{}",car1.getName());
        var car0 = context.getBean("audi",Car.class);
        log.info(car0.getName());
        var car2 = context.getBean("benz",Car.class);
        log.info(car2.getName());
        var car3 = context.getBean("ferrari",Car.class);
        log.info(car3.getName());
        var car4 = context.getBean("helloWorldFromAudiQ8",String.class);
        log.info(car4);
        var vehicle = context.getBean(Vehicle.class);
        log.info(vehicle.getName());
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        var vehicle1= context1.getBean("benz",Vehicle.class);
        log.info(vehicle1.getName());



        ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfigurations.class);
        var car5 = context2.getBean("audi",Car.class);
        var car6 = context2.getBean("audi",Car.class);
        var car7 = context2.getBean("benz",Car.class);
        var car8 = context2.getBean("ferrari",Car.class);
        var car9 = context2.getBean(Car.class);
        var car10 = context2.getBean(Car.class);
        log.info("Hashcode of the object is {}",car5.hashCode());
        log.info("Hashcode of the object is {}",car6.hashCode());
        log.info("Hashcode of the object is {}",car7.hashCode());
        log.info("Hashcode of the object is {}",car8.hashCode());
        log.info("Hashcode of the object is {}",car9.hashCode());
        log.info("Hashcode of the object is {}",car10.hashCode());






















    }
}
