public class Main {

    public static void main(String[] args) {

        Employee employee = new Programmer("Meow Moore", "Программист", 30, 5,
                100000, "Java");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee.getFullTextInfo();
        employee.getCountOfEmp();
    }
}
