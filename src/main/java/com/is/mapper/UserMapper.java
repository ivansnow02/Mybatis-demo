package com.is.mapper;

import com.is.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    List<User> selectAll();

    User selectOne(@Param("username")String username, @Param("password")String password);

    @Select("select * from tb_user where id = #{id}")
    User selectById(int id);
}
