package com.example.restdemo.document.data;

import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, Long> {

	Document findById(long id);
	
}
