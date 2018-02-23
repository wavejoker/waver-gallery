package me.waver.gallery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Creeper
 * @date : 2018/2/22 23:57
 */

@Controller

public class PageController {

    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }
}
