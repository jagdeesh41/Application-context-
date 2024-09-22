package com.jagadeesh.learning.config;

import com.jagadeesh.learning.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.jagadeesh.learning")
public class BeanConfigurations {

    @Bean("audi")
    Car car1()
    {
        return new Car("Audi Q8");
    }
    @Bean
    String helloWorld()
    {
        return "Hello World !";
    }
    @Bean
    String helloWorldFromAudiQ8(Car car)
    {
        return helloWorld()+car.getName();
    }
    @Bean
    Integer number()
    {
        return 29;
    }
    @Bean("benz")
    Car car2()
    {
        return new Car("Benz Z");
    }
    @Primary
    @Bean("ferrari")
    Car car3()
    {
        return new Car("Ferrari");
    }
}
