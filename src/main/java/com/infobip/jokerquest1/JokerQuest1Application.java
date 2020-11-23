package com.infobip.jokerquest1;

import com.infobip.jokerquest1.data.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokerQuest1Application {

    @Autowired
    TransactionsRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(JokerQuest1Application.class, args);
    }

}
