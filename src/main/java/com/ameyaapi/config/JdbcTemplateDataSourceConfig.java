package com.ameyaapi.config;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : huang
 * @date :  2021/4/27
 * @time : 11:22
 * To change this template use File | Settings | File and Code Templates.
 */

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * JdbcTemplate多数据源配置
 * 依赖于数据源配置
 *
 * @see DataSourceConfig
 */
@Configuration
public class JdbcTemplateDataSourceConfig {

    //JdbcTemplate主数据源ds1数据源
    @Primary
    @Bean(name = "baseJdbcTemplate")
    public JdbcTemplate ds1JdbcTemplate(@Qualifier("baseDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    //JdbcTemplate第二个ds2数据源
    @Bean(name = "slaveJdbcTemplate")
    public JdbcTemplate ds2JdbcTemplate(@Qualifier("slaveDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
