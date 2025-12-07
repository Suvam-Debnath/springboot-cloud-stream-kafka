package com.suvam.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;
@Configuration
public class KafkaProducerStreams {
    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){
        return ()->{
            RiderLocation location = new RiderLocation("rider123",16.77,88.32);
            System.out.println("Sending: "+ location.getRiderId());
            return location;
        };
    }
}
