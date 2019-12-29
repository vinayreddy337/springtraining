package com.modak;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@DependsOn("configurations")
public class ComponentClass {
    ComponentClass() {
        System.out.println("component");
    }

    @PostConstruct
    public void postconstructimpl() {
        System.out.println("called before others are called");
    }

    @PreDestroy
    public void predestroyimpl() {
        System.out.println("m3");
    }
}
