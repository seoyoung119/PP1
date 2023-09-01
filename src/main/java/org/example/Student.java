package org.example;

public class Student {
    private String name;
    private String hno;

    public Student(String hno, String name){
        this.hno = hno;
        this.name = name;

    }

    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hno='" + hno + '\'' +
                '}';
    }
}
