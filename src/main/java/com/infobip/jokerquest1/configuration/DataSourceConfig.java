package com.infobip.jokerquest1.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:./database1;DB_CLOSE_ON_EXIT=FALSE;FILE_LOCK=FS;CIPHER=AES;");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password(SecretDecrypter.decrypt("zeauhauo gkuijfqiimeht"));
        return dataSourceBuilder.build();
    }
}
