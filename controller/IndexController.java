package com.hunau.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title:${file_name}</p>
 * <p>程序说明:${type_name}</p>
 * <p>开发公司:湖南农业大学物联网工程</p>
 * 程序员：${user}
 * 开发日期：${date} ${time}
 * 版权所有：湖南农业大学物联网工程版本所有
 */
@Controller
@RequestMapping("hello")
public class IndexController {
    @RequestMapping("123")
    public String index(){
        return "index";
    }


}

