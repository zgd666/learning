package com.zgd.service;

import com.zgd.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("UserService")
public class UserServiceImpl  implements UserService{
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> getAllUsers() {
        for (Map<String, Object> stringObjectMap : jdbcTemplate.queryForList("select * from user")) {
            String name = stringObjectMap.get("name").toString();
            System.out.println(name);
        }
        return null;
    }
}
