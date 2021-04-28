package com.anycompany.base;

public class ProductManager extends Employee {

    private String nameOfProject;

    //constructors
    public ProductManager(String name, String lastname, int age, String position, int experience, int salary,
                          String nameOfProject) {
        super(name, lastname, age, position, experience, salary);
        this.nameOfProject = nameOfProject;
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
                + "\nНазвание проекта: " + nameOfProject + "\n";
    }


    //getters
    public String getNameOfProject() {
        return nameOfProject;
    }

    //setters
    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }
}
