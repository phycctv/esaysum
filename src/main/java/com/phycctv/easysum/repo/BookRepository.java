package com.phycctv.easysum.repo;

import org.springframework.data.repository.CrudRepository;

import com.phycctv.easysum.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

}
