package com.suvam.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.function.Supplier;
@Configuration
public class KafkaProducerStreams {
    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){
        Random random = new Random();
        return ()->{
            String riderId = "rider" + random.nextInt(20);
            RiderLocation location = new RiderLocation(riderId,16.77,88.32);
            System.out.println("Sending: "+ location.getRiderId());
            return location;
        };
    }
}
