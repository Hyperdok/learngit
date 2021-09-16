package com.example.demo.mapper;

/**
 * @author:hxy
 * @date 2021/9/15
 * @apiNote
 */
import com.example.demo.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name,String password);

}
