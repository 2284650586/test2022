package lxt.dao;

import lxt.domain.Student;

import java.util.List;

public interface StudentDao {

    public Student getById(String id);

    public void save(Student student);

    List<Student> getAll();


    List<Student> select2(int age);

    List<Student> select3(char z);
}
