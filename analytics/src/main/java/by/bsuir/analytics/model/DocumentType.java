package by.bsuir.analytics.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class DocumentType {
    @Id
    @Column(name = "documenttype_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String documentType;

    public DocumentType() {
    }

    public DocumentType(Long id, String documentType) {
        this.id = id;
        this.documentType = documentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentType that = (DocumentType) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(documentType, that.documentType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, documentType);
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "id=" + id +
                ", documentType='" + documentType + '\'' +
                '}';
    }
}
