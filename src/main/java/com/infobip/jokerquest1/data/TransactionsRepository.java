package com.infobip.jokerquest1.data;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionsRepository extends CrudRepository<Transaction, Long> {

    // Напишите запрос который вернет список не уникальных UUID транзакций.
    String FIND_DUPLICATES_QUERY = "";

    @Query(FIND_DUPLICATES_QUERY)
    List<String> findDuplicates();

}
