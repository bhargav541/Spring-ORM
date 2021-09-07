import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.orm.dao.StudentDao;
import spring.orm.entities.Student;


public class Example {
public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    
    StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
    
    Student student = new Student(103,"harshitha","harshitha");
    int r=studentDao.insert(student);
    System.out.println("Student Details....:: "+r);
}
}