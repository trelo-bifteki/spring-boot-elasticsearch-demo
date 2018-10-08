package com.trelobifteki.demo.elasticsearch.springbootelasticsearchdemo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Document(indexName = "books")
public class Book {

	@Id
	private String id;

	@Field(type = FieldType.Text, store = true)
	private String title;
	
}
