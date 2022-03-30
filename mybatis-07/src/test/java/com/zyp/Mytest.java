package com.zyp;

import com.zyp.dao.TeacherMapper;
import com.zyp.pojo.Teacher;
import com.zyp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> list = mapper.getTeacher(1);
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }


        sqlSession.close();

    }
    @Test
    public void Test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> list = mapper.getTeacher2(1);
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }


        sqlSession.close();

    }
}
