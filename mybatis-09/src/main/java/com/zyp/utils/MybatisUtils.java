package com.zyp.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            //��ȡmybatis��sqlSessionFactory ����
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //��Ȼ���� SqlSessionFactory������˼�壬���ǿ��Դ��л�� SqlSession ��ʵ����SqlSession �ṩ�������ݿ�ִ�� SQL ������������з�����
    // �����ͨ�� SqlSession ʵ����ֱ��ִ����ӳ��� SQL ���
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}
