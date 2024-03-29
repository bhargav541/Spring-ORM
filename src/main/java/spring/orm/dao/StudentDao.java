package spring.orm.dao;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import spring.orm.entities.Student;

public class StudentDao {
    
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int insert(Student student)
    {

           Integer i = (Integer)this.hibernateTemplate.save(student); 
        return i;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
}