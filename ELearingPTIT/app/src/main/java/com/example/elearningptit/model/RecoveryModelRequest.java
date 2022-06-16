package com.example.elearningptit.model;

public class RecoveryModelRequest {
    private String key;

    private String codeValue;

    public RecoveryModelRequest() {
    }

    public RecoveryModelRequest(String key, String codeValue) {
        this.key = key;
        this.codeValue = codeValue;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }
}
