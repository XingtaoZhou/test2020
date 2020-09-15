package com.zxt.entity;

public class Student {
    private Integer sno;
    private String sname;
    private String email;
    private String sex;
    private Integer age;

    public Student() {
    }

    public Student(Integer sno, String sname, String email, String sex, Integer age) {
        this.sno = sno;
        this.sname = sname;
        this.email = email;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
