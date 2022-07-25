package com.wcs.SpringInitializr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @GetMapping("/doctor1")
    @ResponseBody
    public String displayFirstDoctor() {
        return ("William Hartnell");
    }

    @GetMapping("/doctor10")
    @ResponseBody
    public String displaySecondDoctor() {
        return ("David Tennant");
    }

    @GetMapping("/doctor13")
    @ResponseBody
    public String displayThirdDoctor() {
        return ("Jodie Whittaker");
    }
}
