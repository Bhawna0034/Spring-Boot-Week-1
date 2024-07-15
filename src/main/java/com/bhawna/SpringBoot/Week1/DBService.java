package com.bhawna.SpringBoot.Week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private final DB db;

    public DBService(DB db) {
        this.db = db;
    }

    public String getData(){
        return db.getData();
    }
}
