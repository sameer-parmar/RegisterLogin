package com.example.RegisterLogin.Dto;

//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;

public class EmployeeDto {
    private final int employeeid;
    private final String employeename;
    private final String email;
    private String password;

    public EmployeeDto(int employeeid, String employeename, String email, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
    }
    public EmployeeDto(int employeeid, String employeename) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = null;
        this.password = null;
    }

    public EmployeeDto() {
        this.employeeid = 0;
        this.employeename = null;
        this.email = null;
        this.password = null;
    }



    public int getEmployeeid() {
        return employeeid;
    }

//    public void setEmployeeid(int employeeid) {
//        this.employeeid = employeeid;
//    }

    public String getEmployeename() {
        return employeename;
    }

//    public void setEmployeename(String employeename) {
//        this.employeename = employeename;
//    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
