package com.subodh.sprintboot90days.springbootPlacement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Apple getApple(){
        return new Apple();
    }

    @Bean
    DB db(@Value("${deploy.env:development}") String deployEnv) {
        if ("production".equalsIgnoreCase(deployEnv)) {
            return new ProdDB();
        }

        return new DevDB();
    }
}
