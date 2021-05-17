package cn.lr1314.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserAuthenticationMapper {

    @Select("SELECT count(*) FROM user where username=#{username} && password=#{password}")
    int UserLogin(@Param("username") String username,@Param("password") String password);
}
