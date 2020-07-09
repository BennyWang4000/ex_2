package com.example.user.ex_2.SQLite;

public class TableData {
    private String account, password, logInTime;
    private int id;

    public TableData(int id, String account, String password, String logInTime) {
        this.account = account;
        this.password = password;
        this.logInTime = logInTime;
        this.id= id;
    }
    public TableData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogInTime() {
        return logInTime;
    }

    public void setLogInTime(String logInTime) {
        this.logInTime = logInTime;
    }
}
