package com.modak;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("configurations")
@ComponentScan("test")
public class SpringconfigClass {

    SpringconfigClass() {
        System.out.println("config class");
    }

    @Bean
    public String m1() {
        System.out.println("m1");
        return "m1()";
    }

    @Bean(name = "m2bean")
    public String m2() {
        System.out.println("m2");
        return "m2";
    }


}
