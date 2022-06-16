package com.example.elearningptit.model;

public class Document {
    private int documentId;
    private String documentName;
    private String fileType;
    private String createAt;

    public Document(int documentId, String documentName, String fileType, String createAt) {
        this.documentId = documentId;
        this.documentName = documentName;
        this.fileType = fileType;
        this.createAt = createAt;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
