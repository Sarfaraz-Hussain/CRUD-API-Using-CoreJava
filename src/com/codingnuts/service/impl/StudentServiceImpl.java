package com.codingnuts.service.impl;

import java.util.List;

import com.codingnuts.dao.DAO;
import com.codingnuts.dao.impl.DAOImpl;
import com.codingnuts.pojo.Student;
import com.codingnuts.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public void saveStudentsList(List<Student> studentList) {
        DAO dao = new DAOImpl();
        dao.saveList(studentList);
    }

}
