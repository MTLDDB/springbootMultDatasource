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
@MapperScan(basePackages ="com.ameyaapi.base.mapper", sqlSessionTemplateRef  = "baseSqlSessionTemplate")
public class MybatisPlusConfigBase {

    //主数据源 ds1数据源
    @Primary
    @Bean("baseSqlSessionFactory")
    public SqlSessionFactory ds1SqlSessionFactory(@Qualifier("baseDataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath*:mapper.base/**/*.xml"));
        return sqlSessionFactory.getObject();
    }

    @Primary
    @Bean(name = "baseTransactionManager")
    public DataSourceTransactionManager ds1TransactionManager(@Qualifier("baseDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name = "baseSqlSessionTemplate")
    public SqlSessionTemplate ds1SqlSessionTemplate(@Qualifier("baseSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
