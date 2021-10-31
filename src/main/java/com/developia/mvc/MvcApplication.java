package com.developia.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan   //서블릿 자동 등록
@SpringBootApplication
public class MvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcApplication.class, args);
    }

//    spring boot가 자동적으로 해줌
//    @Bean
//    InternalResourceViewResolver internalResourceViewResolver(){
//        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
//    }
}
