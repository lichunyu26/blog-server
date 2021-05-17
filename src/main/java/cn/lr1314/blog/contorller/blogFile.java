package cn.lr1314.blog.contorller;

import cn.lr1314.blog.utils.ResponseModel;
import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog-file/")
@EnableAutoConfiguration
public class blogFile {


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    JSONObject toGetBlogFileList() {
        return ResponseModel.suc("it is ok");
    }


}
