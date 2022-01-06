package lxt.test;

import lxt.dao.StudentDao;
import lxt.domain.Student;
import lxt.util.SqlSessionUtil;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

//        Student s = studentDao.getById("A0001");
//        System.out.println(s);

//        List<Student> list = studentDao.select2(23);
//        for (Student s : list) {
//            System.out.println(s);
//        }
        List<Student> list = studentDao.select3('z');
        for (Student s : list) {
            System.out.println(s);
        }

    }

}
