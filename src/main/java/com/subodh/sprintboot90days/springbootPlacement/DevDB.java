package com.subodh.sprintboot90days.springbootPlacement;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "development", matchIfMissing = true)
public class DevDB implements DB{

    public String getData(){
        return "Dev Data";
    }
}
