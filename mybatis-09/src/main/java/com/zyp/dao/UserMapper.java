package com.zyp.dao;

import com.zyp.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User queryUserById(@Param("id") int id);
}
