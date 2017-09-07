package com.sinotopia.dao;

import com.sinotopia.pojo.Content;

import java.util.List;

/**
 * Created with IDEA
 * Created by ${jie.chen} on 2016/7/14.
 */
public interface ContentDao {
    List<Content> findContentList();

    int insertSelective(Content content) ;

}
