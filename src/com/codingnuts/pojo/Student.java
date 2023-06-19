package com.codingnuts.pojo;

public class Student {
    private String userName;
    private String email;
    private String rollNumber;

    public Student(String userName, String email, String rollNumber) {
        this.userName = userName;
        this.email = email;
        this.rollNumber = rollNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student [userName=" + userName + ", email=" + email + ", rollNumber=" + rollNumber + "]";
    }

}
