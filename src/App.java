import java.util.ArrayList;
import java.util.List;

import com.codingnuts.pojo.Student;
import com.codingnuts.service.StudentService;
import com.codingnuts.service.impl.StudentServiceImpl;

public class App {
       public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        // populated the list
        list.add(new Student("Ajay", "test@com", "123"));
        list.add(new Student("vijay", "abc@com", "456"));
        list.add(new Student("SRk", "gth@com", "678"));
        list.add(new Student("Jayveer", "Jayveer@com", "123"));
        list.add(new Student("kalash", "kalash@com", "123"));
        list.add(new Student("Sarfaraj", "sarfaraj@com", "123"));
        list.add(new Student("sahil", "sahil@com", "123"));

        StudentService service = new StudentServiceImpl();
        service.saveStudentsList(list);

    }
}
