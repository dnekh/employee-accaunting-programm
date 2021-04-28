package com.anycompany.base;

abstract public class Employee {

    protected String name;
    protected String lastname;
    protected int age;
    protected String position;
    protected int experience;
    protected int salary;
    static int countOfEmp = 0;


    public Employee(String name, String lastname, int age, String position, int experience, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.position = position;
        this.experience = experience;
        this.salary = salary;
        countOfEmp++;
    }


    abstract public void getEmpInfo();

    abstract public void getCountOfEmp();


    //getters
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
