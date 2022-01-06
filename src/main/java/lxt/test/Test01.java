package lxt.test;

import lxt.domain.Student;
import lxt.service.StudentService;
import lxt.service.impl.StudentServiceImpl;
import lxt.util.ServiceFactory;


public class Test01 {

    public static void main(String[] args) {
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        Student student = new Student();
        student.setId("A0010");
        student.setName("cxk");
        student.setAge(23);
        ss.save(student);
    }

}
