package cn.lr1314.blog.service;

import cn.lr1314.blog.mapper.UserAuthenticationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationMapperServer {
    @Autowired
    UserAuthenticationMapper uap;

    public Boolean UserLogin(String username, String password) {
        int okCount = uap.UserLogin(username, password);
        return okCount == 1;
    }

}
