package com.example.demo.service;

/**
 * @author:hxy
 * @date 2021/9/15
 * @apiNote
 */
import com.example.demo.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name,String password);

}
