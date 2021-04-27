package com.ameyaapi.config;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : huang
 * @date :  2021/4/27
 * @time : 11:25
 * To change this template use File | Settings | File and Code Templates.
 */

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Mybatis主数据源ds1配置
 * 多数据源配置依赖数据源配置
 * @see  DataSourceConfig
 */
@Configuration
@MapperScan(basePackages ="com.ameyaapi.slave.mapper", sqlSessionTemplateRef  = "slaveSqlSessionTemplate")
public class MybatisPlusConfigSlave {

    //主数据源 ds1数据源
    @Primary
    @Bean("slaveSqlSessionFactory")
    public SqlSessionFactory ds1SqlSessionFactory(@Qualifier("slaveDataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath*:mapper.slave/**/*.xml"));
        return sqlSessionFactory.getObject();
    }

    @Primary
    @Bean(name = "slaveTransactionManager")
    public DataSourceTransactionManager ds1TransactionManager(@Qualifier("slaveDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name = "slaveSqlSessionTemplate")
    public SqlSessionTemplate ds1SqlSessionTemplate(@Qualifier("slaveSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}

