package com.newer.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * (Student)数据传输对象
 *
 * @author makejava
 * @since 2020-03-31 22:34:36
 */

public class Student{
    
    private int id;
    
    private String password;
    
    private String name;
    
    private String sex;
    
    private String birthday;
    private Class shift;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public Class getShift() {
        return shift;
    }

    public void setShift(Class shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", shift=" + shift +
                '}';
    }
}