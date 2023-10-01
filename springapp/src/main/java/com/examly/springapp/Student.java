import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Students {
    private int studentId;
    private String firstName;
    private String lastName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


public class Student {
    public static void main(String[] args) {
        // Using Java-based configuration
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Students javaStudent = javaContext.getBean("students", Students.class);
        System.out.println("Java Config Student Details:");
        System.out.println("ID: " + javaStudent.getStudentId());
        System.out.println("First Name: " + javaStudent.getFirstName());
        System.out.println("Last Name: " + javaStudent.getLastName());

        // Using XML configuration
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        Students xmlStudent = xmlContext.getBean("students", Students.class);
        System.out.println("\nXML Config Student Details:");
        System.out.println("ID: " + xmlStudent.getStudentId());
        System.out.println("First Name: " + xmlStudent.getFirstName());
        System.out.println("Last Name: " + xmlStudent.getLastName());
    }
}
