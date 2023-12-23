package com.example.contactmanagerapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contacts_table")
public class Contacts {
    @ColumnInfo
    //explicitily mentioning
    @PrimaryKey(autoGenerate = true)
    private  int id;
    private String name;
    private String email;

    public Contacts(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

//    This contructor is created to avoid null pointer exception
//    its having no paramters
    public Contacts() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
