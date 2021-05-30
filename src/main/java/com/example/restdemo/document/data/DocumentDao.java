package com.example.restdemo.document.data;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

public interface DocumentDao {

	public List<Document> getAllDocuments(); 
	public Optional<Document> getDocumentById(Long documentId);
	
	public Document createNewDocument(Document newDocument);
	public Document updateDocument(Document document);
	public Document removeDocument(Long documentId);
	
}
