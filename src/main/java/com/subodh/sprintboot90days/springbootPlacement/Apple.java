package com.subodh.sprintboot90days.springbootPlacement;


import jakarta.annotation.PostConstruct;

public class Apple {

    void eatApple(){
        System.out.println("I am eating the apple ");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before use");
    }
}
