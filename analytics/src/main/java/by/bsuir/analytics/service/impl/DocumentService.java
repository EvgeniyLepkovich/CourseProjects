package by.bsuir.analytics.service.impl;

import by.bsuir.analytics.dao.DocumentRepository;
import by.bsuir.analytics.model.Document;
import by.bsuir.analytics.service.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService implements IDocumentService {
    @Autowired
    private DocumentRepository docDao;

    @Override
    public void save(Document document) {
        docDao.save(document);
    }
}
