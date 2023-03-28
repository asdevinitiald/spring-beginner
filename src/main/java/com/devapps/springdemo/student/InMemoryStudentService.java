package com.devapps.springdemo.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InMemoryStudentService implements StudentService {
    
    private final InMemoryStudentDao inMemoryStudentDao;

    public InMemoryStudentService(InMemoryStudentDao inMemoryStudentDao) {
        this.inMemoryStudentDao = inMemoryStudentDao;
    }


    @Override
    public List<Student> findAllStudents() {
        return inMemoryStudentDao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
        return this.inMemoryStudentDao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return inMemoryStudentDao.update(s);
    }

    @Override
    public void delete(String email) {
        inMemoryStudentDao.delete(email);
    }

}
