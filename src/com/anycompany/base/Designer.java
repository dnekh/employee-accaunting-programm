package com.anycompany.base;

public class Designer extends Employee {


    private String designProgram;

    //constructors
    public Designer(String name, String lastname, int age, String position, int experience, int salary,
                    String designProgram) {
        super(name, lastname, age, position, experience, salary);
        this.designProgram = designProgram;
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
                + "\nРабочая программа: " + designProgram + "\n";
    }

    //getters
    public String getDesignProgram() {
        return designProgram;
    }

    //setters
    public void setDesignProgram(String designProgram) {
        this.designProgram = designProgram;
    }
}
