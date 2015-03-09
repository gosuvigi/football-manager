package com.vigi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by vigi on 3/9/2015.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String greeting(@RequestParam(required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }

}
