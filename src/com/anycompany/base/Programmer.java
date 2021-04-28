package com.anycompany.base;

public class Programmer extends Employee {

    private String language;

    //constructors
    public Programmer(String name, String lastname, int age, String position, int experience, int salary,
                      String language) {
        super(name, lastname, age, position, experience, salary);
        this.language = language;
    }


    @Override
    public void getEmpInfo() {
        toString();
    }

    @Override
    public void getCountOfEmp() {
        System.out.println(countOfEmp);
    }

    @Override
    public String toString() {
        return "Сотрудник компании: "
                + "\nИмя: " + name
                + "\nФамилия: " + lastname
                + "\nВозраст: " + age
                + "\nДолжность: " + position
                + "\nСтаж в компании (лет): " + experience
                + "\nЗарплата: " + salary
                + "\nЯзык програмирования: " + language + "\n";
    }

    //getters
    public String getLanguage() {
        return language;
    }

    //setters
    public void setLanguage(String language) {
        this.language = language;
    }
}
