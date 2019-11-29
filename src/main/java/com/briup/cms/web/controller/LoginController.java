package com.briup.cms.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: jd1913-cms
 * @description:
 * @author: wangzh
 * @create: 2019-11-28 16:09
 **/
@RestController
public class LoginController {
    @PostMapping("/authentication/form")
    public void login(String username,String password) {

    }

}
