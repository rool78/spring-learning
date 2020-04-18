package rool.spring.springlearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rool.spring.springlearning.domain.User;
import rool.spring.springlearning.repositories.OfferRepository;
import rool.spring.springlearning.repositories.UserRepository;

@Controller
public class IndexController {



    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index.html";
    }



}
