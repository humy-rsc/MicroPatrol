package com.rsckj.micropatrol.mapper.ext;

import com.rsckj.micropatrol.po.Users;
import com.rsckj.micropatrol.po.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersExtMapper {

    List<Users> findAll();

}