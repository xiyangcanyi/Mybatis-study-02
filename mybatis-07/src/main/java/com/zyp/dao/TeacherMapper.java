package com.zyp.dao;

import com.zyp.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacher(@Param("tid") int id);
    List<Teacher> getTeacher2(@Param("tid") int id);

}
