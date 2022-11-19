package com.nu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @Bean
    public DataSource dataSource() { // goi vao db ipay
        try {
            DataSource dataSource = DataSourceBuilder
                    .create()
                    .username(username)
                    .password(password)
                    .url(url)
                    .driverClassName(driverClass)
                    .build();
            return dataSource;
        }catch (Exception e){
            System.out.println(e.getCause());
        }
        return null;
    }
//    @Bean
//    public DataSource dataSourcePRF() { // goi vao db profile
//        return DataSourceBuilder
//                .create()
//                .username("root")
//                .password("Ab123456")
//                .url("jdbc:mysql://localhost:3306/world")
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .build();
//    }
}
