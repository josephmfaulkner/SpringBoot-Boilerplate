package com.josephmfaulkner.app.document.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("documentsDaoImplPsql")
public class DocumentDaoImplPsql implements DocumentDao{

	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public List<Document> getAllDocuments() {
		// TODO Auto-generated method stub
		return (List<Document>) documentRepository.findAll();
	}

	@Override
	public Optional<Document> getDocumentById(Long documentId) {
		// TODO Auto-generated method stub
		return documentRepository.findById(documentId);
	}

	@Override
	public Document createNewDocument(Document newDocument) {

		Document createNewDocument = new Document(newDocument.getName(), newDocument.getDescription());
		documentRepository.save(createNewDocument);
		
		return createNewDocument;
	}

	@Override
	public Document updateDocument(Document document) {
		// TODO Auto-generated method stub
		Document updateDocument = documentRepository.findById(document.getId()).get();
		if(updateDocument != null)
		{
			updateDocument.setName(document.getName());
			updateDocument.setDescription(document.getDescription());
			documentRepository.save(updateDocument);
		}
		
		return updateDocument;
	}

	@Override
	public Document removeDocument(Long documentId) {
		// TODO Auto-generated method stub
		Document removeDocument = documentRepository.findById(documentId).get();
		if(removeDocument != null)
		{
			documentRepository.delete(removeDocument);
		}
		
		return removeDocument;
	}

}
