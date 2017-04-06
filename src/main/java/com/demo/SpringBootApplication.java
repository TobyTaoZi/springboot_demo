/*
package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


*/
/**
 * Created by taojingjing on 2017/4/5.
 *//*


@RestController
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

    @RequestMapping("/")
    public String home(){
        return "hello";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
    }

//java8 lambda写法

*/
/* @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer(){
        return (container ->{
            ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
            container.addErrorPages(error401Page, error404Page, error500Page);
        });
    }*//*




*/
/**
     * 错误页面配置
     * @return
     *//*


    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
                ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
                container.addErrorPages(error401Page, error404Page, error500Page);
            }
        };
    }
}

*/
