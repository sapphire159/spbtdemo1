package com.newer.spbtdemo1.mapper;

import com.newer.spbtdemo1.bean.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select stuid,stuname,stusex from stuinfo")
    List<Student> findAll();

}
