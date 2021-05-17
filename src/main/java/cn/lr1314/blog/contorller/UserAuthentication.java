package cn.lr1314.blog.contorller;

import cn.lr1314.blog.service.UserAuthenticationMapperServer;
import cn.lr1314.blog.utils.ResponseModel;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*用户鉴权*/
@RestController
@RequestMapping("/authentication/")
@EnableAutoConfiguration
public class UserAuthentication {
    @Autowired
    UserAuthenticationMapperServer ums;

    /*阿里oss相关*/
    @Value("${oss.endpoint}")
    String endpoint;
    @Value("${oss.accessKeyId}")
    String accessKeyId;
    @Value("${oss.accessKeySecret}")
    String accessKeySecret;
    @Value("${oss.bucketName}")
    String bucketName;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    JSONObject toGetBlogFileList(String username, String password) {
        if (ums.UserLogin(username, password)) {
            return ResponseModel.suc("it is ok");
        }
        return ResponseModel.fail("登录失败！");
    }

    /*生成阿里云临时鉴权*/
    @RequestMapping(value = "/oss", method = RequestMethod.GET)
    JSONObject toCreateOSSSTS() {

        return ResponseModel.fail("鉴权失败！");
    }

}
