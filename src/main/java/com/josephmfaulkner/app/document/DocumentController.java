package com.josephmfaulkner.app.document;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.josephmfaulkner.app.document.data.Document;
import com.josephmfaulkner.app.document.data.DocumentDao;

@RestController
@RequestMapping("/docs")
public class DocumentController {

	@Autowired()
	@Qualifier("documentsDaoImplPsql")
	private DocumentDao documentDao; 
	
	@GetMapping()
	public List<Document> getAllDocs() {
		return documentDao.getAllDocuments();
	}
	
	@PostMapping()
    public Document createDocument(@RequestBody Document newDocument) {
		return documentDao.createNewDocument(newDocument);
    }
	
}
