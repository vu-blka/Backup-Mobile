package com.example.elearningptit.model;

public class Teacher {
    private String fullname;
    private String phone;
    private String email;

    public Teacher() {
    }

    public Teacher(String fullname, String phone, String email) {
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
