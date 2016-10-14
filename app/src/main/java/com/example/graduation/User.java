package com.example.graduation;

/**
 * Created by 정성욱 on 2016-10-13.
 */
public class User {
    String name, username, password;
    int age;

    public User(String name, int age, String username, String password) {//User overloading
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.age = -1;
        this.name = "";
    }
}
