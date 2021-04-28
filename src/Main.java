import com.anycompany.base.Designer;
import com.anycompany.base.Employee;
import com.anycompany.base.ProductManager;
import com.anycompany.base.Programmer;

public class Main {

    public static void main(String[] args) {

        //Employee emp = new Employee();  !!!НЕВОЗМОЖНО СОЗДАТЬ ЭКЗЕМПЛЯР АБСТРАКТНОГО КЛАССА!!!

        Programmer programmer = new Programmer("Mors", "Moore", 25, "Java developer",
                3, 50_000, "Java");
        Employee programmer_1 = new Programmer(null, null, 0, null, 0,
                0, null);

        Designer designer = new Designer("Meow", "Moore", 23, "UX/UI Designer",
                3, 45_000, "Figma");
        Employee designer_1 = new Designer(null, null, 0, null, 0,
                0, null);

        ProductManager pm = new ProductManager("Hello", "Kitty", 30, "Product Manager",
                4, 55_000, null);
        Employee pm_1 = new ProductManager(null, null, 0, null, 0,
                0, null);
        
        Object[] companyStaff = new Object[6];
        companyStaff[0] = programmer;
        companyStaff[1] = programmer_1;
        companyStaff[2] = designer;
        companyStaff[3] = designer_1;
        companyStaff[4] = pm;
        companyStaff[5] = pm_1;

        for (Object o : companyStaff) {
            System.out.println(o);
        }

        System.out.println("-----------------");
        programmer.getCountOfEmp();
    }
}
