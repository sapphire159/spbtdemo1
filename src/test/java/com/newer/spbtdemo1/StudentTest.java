package com.newer.spbtdemo1;

import com.newer.spbtdemo1.bean.Student;
import com.newer.spbtdemo1.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test(){
        List<Student> list=studentMapper.findAll();
        System.out.println(list.size());
    }

}
