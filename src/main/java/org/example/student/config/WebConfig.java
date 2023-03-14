package org.example.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = "org.example.student")
@EnableWebMvc
public class WebConfig{


   @Bean
    public InternalResourceViewResolver resolver()
{
    InternalResourceViewResolver internalResourceViewResolver =
            new InternalResourceViewResolver();

    System.out.println("in the web config");
    internalResourceViewResolver.setViewClass(JstlView.class);
    internalResourceViewResolver.setPrefix("/WEB-INF/views/");
    internalResourceViewResolver.setSuffix(".jsp");

    return internalResourceViewResolver;
}
}
