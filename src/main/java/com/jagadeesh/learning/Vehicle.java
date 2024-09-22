package com.jagadeesh.learning;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Vehicle {
    private String name;
    private VehicleType type;
    private String color;

    @PostConstruct
    void init()
    {
        this.name = "Rolls Royce";
        this.color = "green";
        this.type = VehicleType.PREMIUM;
    }
}
