package by.bsuir.analytics.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class DocumentStatus {
    @Id
    @Column(name = "documentstatus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String documentStatus;

    public DocumentStatus() {
    }

    public DocumentStatus(Long id, String documentStatus) {
        this.id = id;
        this.documentStatus = documentStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentStatus that = (DocumentStatus) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(documentStatus, that.documentStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, documentStatus);
    }

    @Override
    public String toString() {
        return "documentStatus{" +
                "id=" + id +
                ", documentStatus='" + documentStatus + '\'' +
                '}';
    }
}
