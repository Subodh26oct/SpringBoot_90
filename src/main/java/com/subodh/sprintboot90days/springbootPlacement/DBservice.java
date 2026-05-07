package com.subodh.sprintboot90days.springbootPlacement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBservice {

    final private DB db;

    public DBservice(DB db) {
        this.db = db;
    }


    String getData(){
       return db.getData();
    }
}
