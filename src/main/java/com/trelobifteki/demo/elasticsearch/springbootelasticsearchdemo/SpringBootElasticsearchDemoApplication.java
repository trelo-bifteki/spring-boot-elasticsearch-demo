package com.trelobifteki.demo.elasticsearch.springbootelasticsearchdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@Import(ElasticsearchConfiguration.class)
@EnableElasticsearchRepositories
public class SpringBootElasticsearchDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticsearchDemoApplication.class, args);
	}
}
