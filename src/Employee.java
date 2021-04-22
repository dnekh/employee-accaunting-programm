public class Employee {

    private String name;
    private String position;
    private int age;
    private int experience;
    private int salary;
    private static int countOfEmp = 0;


    public Employee() {
        countOfEmp++;
    }

    public Employee(String name, String position, int age, int experience) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.experience = experience;
        countOfEmp++;
    }

    public Employee(String name, String position, int age, int experience, int salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        countOfEmp++;
    }


    public void getTextInfo() {
        System.out.println("Сотрудник компании: " + name + "\nВозраст: " + age + " лет\nДолжность: " + position + "\n");;
    }

    public void getCountOfEmp() {
        System.out.println("The company has " + countOfEmp + " employees");
    }


    //getters
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
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

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
