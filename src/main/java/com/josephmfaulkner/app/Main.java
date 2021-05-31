package com.josephmfaulkner.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.josephmfaulkner.app.document.data.Document;
import com.josephmfaulkner.app.document.data.DocumentRepository;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(DocumentRepository documentRepository)
	{
		return args -> {
			Document newDocument = null;
			Long documentsCount = documentRepository.count();
			
			/*
			if(documentsCount <= 1)
			{
				newDocument = new Document("doc1", "Powerpoint Presentation");
				documentRepository.save(newDocument);
				
				newDocument = new Document("doc2", "Expense Reports");
				documentRepository.save(newDocument);
				
				newDocument = new Document("doc3", "Spreadsheet");
				documentRepository.save(newDocument);
				
				newDocument = new Document("doc4", "NewDocument");
				documentRepository.save(newDocument);
				
				newDocument = new Document("doc5", "Database Schema Plan");
				documentRepository.save(newDocument);
			}
			*/
		};
	}

}
