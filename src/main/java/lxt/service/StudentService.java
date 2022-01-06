package lxt.service;

import lxt.domain.Student;

import java.util.List;

public interface StudentService {

    public Student getById(String id);

    public void save(Student student);

    public List<Student> getAll();

}
