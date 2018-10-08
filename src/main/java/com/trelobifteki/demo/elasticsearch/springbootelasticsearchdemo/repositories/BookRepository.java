package com.trelobifteki.demo.elasticsearch.springbootelasticsearchdemo.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.trelobifteki.demo.elasticsearch.springbootelasticsearchdemo.entities.Book;

public interface BookRepository extends ElasticsearchRepository<Book, String>{

}
