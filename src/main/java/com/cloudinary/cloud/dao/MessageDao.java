package com.cloudinary.cloud.dao;

public class MessageDao {

    private String message;

    public MessageDao(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
