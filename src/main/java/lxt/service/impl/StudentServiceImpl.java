package lxt.service.impl;

import lxt.dao.StudentDao;
import lxt.domain.Student;
import lxt.service.StudentService;
import lxt.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {

        Student student = studentDao.getById(id);

        return student;
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public List<Student> getAll() {
        List<Student> list = studentDao.getAll();
        return list;
    }
}
