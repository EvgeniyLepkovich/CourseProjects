package by.bsuir.analytics.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Document {
    @Id
    @Column(name = "document_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String documentName;
    private Double value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documentstatus_id", nullable = false)
    @JsonIgnore
    private DocumentStatus documentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documenttype_id", nullable = false)
    @JsonIgnore
    private DocumentType documentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    @JsonIgnore
    private Company owner;

    public Document() {
    }

    public Document(Long id, String documentName, Double value, DocumentStatus documentStatus, DocumentType documentType, Company owner) {
        this.id = id;
        this.documentName = documentName;
        this.value = value;
        this.documentStatus = documentStatus;
        this.documentType = documentType;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Company getOwner() {
        return owner;
    }

    public void setOwner(Company owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(id, document.id) &&
                Objects.equals(documentName, document.documentName) &&
                Objects.equals(value, document.value) &&
                Objects.equals(documentStatus, document.documentStatus) &&
                Objects.equals(documentType, document.documentType) &&
                Objects.equals(owner, document.owner);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, documentName, value, documentStatus, documentType, owner);
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", documentName='" + documentName + '\'' +
                ", value=" + value +
                ", documentStatus=" + documentStatus +
                ", documentType=" + documentType +
                ", owner=" + owner +
                '}';
    }
}
