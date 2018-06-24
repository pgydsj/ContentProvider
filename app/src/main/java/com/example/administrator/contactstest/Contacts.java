package com.example.administrator.contactstest;

/**
 * Created by Administrator on 2018/6/24.
 */

public class Contacts {
    private String name;
    private String number;

    public Contacts(String name,String number){
        this.name=name;
        this.number=number;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }
}

