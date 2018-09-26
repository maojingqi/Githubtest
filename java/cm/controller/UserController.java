package cm.controller;

import cm.services.imp.UserServicesimp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServicesimp userservice;

    @RequestMapping("SelectUser")
    public ModelAndView toLogin(Model mavv) {
        userservice.selectall();
        ModelAndView mav = new ModelAndView("idd");
        mavv.addAttribute("user", userservice.selectall());
        return mav;
    }

}
