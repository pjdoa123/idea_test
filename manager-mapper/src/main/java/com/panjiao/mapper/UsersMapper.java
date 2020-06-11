package com.panjiao.mapper;

import com.panjiao.pojo.Users;

import java.util.List;

public interface UsersMapper {

    void insertUsers(Users users);

    List<Users> selectUsersAll();

}
