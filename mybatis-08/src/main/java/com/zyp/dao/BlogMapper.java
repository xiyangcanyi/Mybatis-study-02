package com.zyp.dao;

import com.zyp.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //��������
    int addBlog(Blog blog);
    //��ѯblog
    List<Blog> queryBlogIF(Map map);
    List<Blog> queryBlogChoose(Map map);
    //����blog
    int updateBlog(Map map);

    //��ѯ��1-2-3�Ų���
    List<Blog> queryBlogForeach(Map map);


}
