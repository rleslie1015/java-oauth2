package com.lambdaschool.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//use this to enable my own routing
@EnableWebMvc
@EnableJpaAuditing
@SpringBootApplication
public class Oauth2Application
{

    public static void main(String[] args)
    {
        //application context how our app runs
        ApplicationContext ctx = SpringApplication.run(Oauth2Application.class,
                args);

        DispatcherServlet dispatcherServlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
    }
}