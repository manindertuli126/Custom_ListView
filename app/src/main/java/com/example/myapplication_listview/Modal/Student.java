package com.example.myapplication_listview.Modal;

import java.io.Serializable;

public class Student implements Serializable {
    private String sid;
    private String sname;
    private String country;

    public Student(String sid, String sname, String country) {
        this.sid = sid;
        this.sname = sname;
        this.country = country;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
