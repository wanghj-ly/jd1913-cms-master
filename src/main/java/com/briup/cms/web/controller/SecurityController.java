package com.briup.cms.web.controller;

import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @program: jd1913-cms
 * @description:
 * @author: wangzh
 * @create: 2019-11-28 16:12
 **/
@RestController
@ApiIgnore
public class SecurityController {
    @GetMapping("/authenticaion/login")
    public Message ll() {
        return MessageUtil.error(401,"请跳转到登陆页面");
    }
}
