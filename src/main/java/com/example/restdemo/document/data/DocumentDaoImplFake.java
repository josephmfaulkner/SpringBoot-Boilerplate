package com.example.restdemo.document.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("documentsDaoImplFake")
public class DocumentDaoImplFake  {

	private List<Document> dummyDocs = new ArrayList<Document>()
	{{
		add(new Document("doc1", "First Document"));
		add(new Document("doc2", "Second Document"));
		add(new Document("doc3", "Third Document"));
		add(new Document("doc4", "Forth Document"));
	}};
	

	public List<Document> getAllDocuments() {
		// TODO Auto-generated method stub
		return this.dummyDocs;
	}


	public Document getDocumentById(Long documentId) {
		// TODO Auto-generated method stub
		return this.dummyDocs.get(Integer.valueOf(String.valueOf(documentId)));
	}


	public Document createNewDocument(Document newDocument) {
		// TODO Auto-generated method stub
		Document newDocumentAdd = new Document(newDocument.getName(), newDocument.getDescription());
		this.dummyDocs.add(newDocumentAdd);
		return newDocument;
	}


	public Document updateDocument(Document document) {
		// TODO Auto-generated method stub
		return null;
	}


	public Document removeDocument(Long documentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
