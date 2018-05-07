package by.bsuir.analytics.dao;

import by.bsuir.analytics.model.Document;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {
    Document findByDocumentName(String documentName);
    @Query("Select d From Document d join d.documentType dt on dt.documentType = ?1")
    List<Document> findByDocumentType(String documentType);
    @Query("Select d From Document d join d.documentStatus ds on ds.documentStatus = ?1")
    List<Document> findByDocumentStatus(String documentStatus);
    @Query("Select d From Document d join d.owner o on o.name = ?1")
    List<Document> findByDocumentOwner(String companyName);
}
