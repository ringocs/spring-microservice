package com.example.restfulws;

public class HelloWorldBean {
    private String message;
    private String additionalMesage;

    public HelloWorldBean(String message) {
        this.message = message;
        this.additionalMesage = "additional message";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAdditionalMesage() {
        return additionalMesage;
    }

    public void setAdditionalMesage(String additionalMesage) {
        this.additionalMesage = additionalMesage;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message=%s]", message);
    }
}
