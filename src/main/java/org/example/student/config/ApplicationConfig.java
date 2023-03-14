package org.example.student.config;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class ApplicationConfig {
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/studentmanagment");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("sid@123");

        return driverManagerDataSource;
    }


    /*---------------------Internally called Data Source ko--------------------------------------------------------*/

   @Bean
   @Autowired
   public LocalSessionFactoryBean getSession(DataSource dataSource)
   {
           LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
           localSessionFactoryBean.setDataSource(dataSource);
           localSessionFactoryBean.setPackagesToScan("org.example.student.model");
            Properties properties = new Properties();


            properties.put("hibernate.show_sql", "true");
            properties.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
            properties.put("hibernate.hbm2ddl.auto","update");
            localSessionFactoryBean.setHibernateProperties(properties);

            return localSessionFactoryBean;
   }



   /*---------------------Internally called Session Factory ko--------------------------------------------------------*/



  @Bean
  @Autowired
   public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory){
    HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
     hibernateTransactionManager.setSessionFactory(sessionFactory);
     return hibernateTransactionManager;
   }
}
