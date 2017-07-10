package ir.arcinc.controller;

import ir.arcinc.repository.UserRepository;
import ir.arcinc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tahae on 7/10/2017.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
