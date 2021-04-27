package com.ameyaapi.config;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : huang
 * @date :  2021/4/27
 * @time : 11:19
 * To change this template use File | Settings | File and Code Templates.
 */

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 多数据源配置
 */
@Configuration
public class DataSourceConfig {

    //主数据源配置 ds1数据源
    @Primary
    @Bean(name = "baseDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.base")
    public DataSourceProperties ds1DataSourceProperties() {
        return new DataSourceProperties();
    }

    //主数据源 ds1数据源
    @Primary
    @Bean(name = "baseDataSource")
    public DataSource ds1DataSource(@Qualifier("baseDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    //第二个ds2数据源配置
    @Bean(name = "slaveDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSourceProperties ds2DataSourceProperties() {
        return new DataSourceProperties();
    }

    //第二个ds2数据源
    @Bean("slaveDataSource")
    public DataSource ds2DataSource(@Qualifier("slaveDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

}
