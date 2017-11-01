package org.xbding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/user/{userid}" , method = RequestMethod.GET)
    @ResponseBody
    public String getUser(@PathVariable String userid){
        System.out.println("xdadsadhsadhsh");
        return "userid is :" + userid;
    }

    @RequestMapping(value = "/index1" , method = RequestMethod.GET)
    public ModelAndView index(){

        return  new ModelAndView("home");
    }






}
