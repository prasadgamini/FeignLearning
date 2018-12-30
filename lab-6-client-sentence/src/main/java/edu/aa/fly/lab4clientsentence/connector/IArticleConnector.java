package edu.aa.fly.lab4clientsentence.connector;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LAB-4-CLIENT-ARTICLE") // Value is eureka service client id
public interface IArticleConnector {

    @GetMapping("/")
    String getArticle();
}
