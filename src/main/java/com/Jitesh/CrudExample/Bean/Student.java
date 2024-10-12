package com.Jitesh.CrudExample.Bean;

public class Student {

    private int id;
    private String name;
    private int age;
    private String mail;

//    getters and setters


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

//    Constructors
    public Student(int id, String name, int age, String mail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mail = mail;
    }

    public Student() {
        super();
    }

    //    toString
    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                '}';
    }


}
