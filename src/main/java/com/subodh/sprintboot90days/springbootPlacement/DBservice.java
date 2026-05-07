package com.subodh.sprintboot90days.springbootPlacement;

import org.springframework.stereotype.Service;

@Service
public class DBservice {

    private final DB db;

    public DBservice(DB db) {
        this.db = db;
    }


    String getData(){
       return db.getData();
    }
}
