package com.infobip.jokerquest1.data;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import org.springframework.data.annotation.Id;

@Data
@Table("Transactions")
public class Transaction {
    @Id
    private long id;
    private String transactionUuid;
}
