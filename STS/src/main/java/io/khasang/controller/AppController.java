package io.khasang.controller;

import io.khasang.logic.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    Message message;

    @RequestMapping("/")
    public String deleteCurrentOrder(Model model) {
        model.addAttribute("index", message.getInfoMessage());
        return "index";
    }
}

