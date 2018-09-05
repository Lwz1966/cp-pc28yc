package com.dandanyc.service;


import com.dandanyc.entity.User;

/**
 * @Author LiWen
 */

public interface UserService {

    int deleteByPrimaryKey(Integer eggsId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer eggsId);

    User selectByUserName(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
