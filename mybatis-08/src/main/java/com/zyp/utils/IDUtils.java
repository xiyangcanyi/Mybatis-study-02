package com.zyp.utils;

import org.junit.Test;

import java.util.UUID;

@SuppressWarnings("all")//���ƾ���
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
       System.out.println(IDUtils.getId());
       System.out.println(IDUtils.getId());
       System.out.println(IDUtils.getId());
    }
}
