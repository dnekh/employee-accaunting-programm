public class Employee {

    private String fullName;
    private String position;
    private int age;
    private int experience;
    private static int countOfStaff = 0;


    public Employee() {

    }

    public Employee(String fullName, String position, int age, int experience) {
        this.fullName = fullName;
        this.position = position;
        this.age = age;
        this.experience = experience;
        countOfStaff++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Сотрудник компании: " + fullName + "\nВозраст: " + age + " лет\nДолжность: " + position;
    }
}
