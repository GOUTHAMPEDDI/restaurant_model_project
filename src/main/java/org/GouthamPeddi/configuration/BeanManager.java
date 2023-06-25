package org.GouthamPeddi.configuration;

import org.GouthamPeddi.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public List<Restaurant> getRestaurant(){

        return new ArrayList<>();
    }
}
