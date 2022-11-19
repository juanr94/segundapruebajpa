package com.segundoexamen.segundoexamen.configuracion;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourseConfiguracion {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        dataSourceBuilder.url("jdbc:sqlserver://DESKTOP-0KNH76D;databaseName=consultas;trustServerCertificate=true");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("sa123");

        return dataSourceBuilder.build();

    }


}
