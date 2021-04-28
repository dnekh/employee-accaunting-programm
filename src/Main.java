import com.anycompany.base.Designer;
import com.anycompany.base.Employee;
import com.anycompany.base.Programmer;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Programmer programmer = new Programmer();
        Designer designer = new Designer();
        Employee empProg = new Programmer("Meow Moore", "Программист", 30, 5,
                100_000, "Java");
        Employee empDes = new Designer("Super Mors", "Дизайнер", 25, 3,
                70_000, "Adobe Illustrator");
        empProg.getFullTextInfo();
        System.out.println();
        empDes.getFullTextInfo();
        employee.getCountOfEmp();

        System.out.println();
    }
}
