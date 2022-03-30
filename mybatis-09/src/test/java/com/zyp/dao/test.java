package com.zyp.dao;

import com.zyp.pojo.User;
import com.zyp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
       // sqlSession.clearCache();

        System.out.println("================================");
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2=mapper2.queryUserById(1);
        System.out.println(user2);
        sqlSession.close();
        sqlSession2.close();


    }
}
