package com.pornhub.plat.controller;

import com.pornhub.basic.util.AjaxResult;
import com.pornhub.plat.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {

    //@RequestMapping(value = "/login",method = RequestMethod.POST)
    //    @PostMapping("/login")
    //@RequestBody 接收json体形式的请求参数封装到实体类对象中

    @PostMapping("/login")
    @ApiOperation("登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "登录信息", value = "user")
    })
    public AjaxResult login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        //假登录
        if ("admin".equals(username) && "123".equals(password)) {
            return AjaxResult.getAjaxResult().setSuccess(true).setMessage("登录成功!");
        }
        return AjaxResult.getAjaxResult().setSuccess(false).setMessage("登录失败!");
    }


}

