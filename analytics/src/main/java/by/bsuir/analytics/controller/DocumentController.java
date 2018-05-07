package by.bsuir.analytics.controller;

import by.bsuir.analytics.model.Document;
import by.bsuir.analytics.service.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {
    @Autowired
    private IDocumentService documentService;

    public void addDocument(Document document)
    {
        documentService.save(document);
    }

    @Scheduled(fixedRate = 10000)
    private void addDocumentBySchedule()
    {
        addDocument(new Document());
    }
}
