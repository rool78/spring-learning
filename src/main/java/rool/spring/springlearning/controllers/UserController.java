package rool.spring.springlearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rool.spring.springlearning.domain.User;
import rool.spring.springlearning.repositories.UserRepository;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/userForm")
    public String greetingForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/userForm")
    public String greetingSubmit(@ModelAttribute User user) {
        System.out.println("@@##--Nombre: " + user.getName() + " Localizacion: " + user.getLocation());
        userRepository.save(user);
        return "result";
    }

    @RequestMapping("/list")
    public String getOffers(Model model){
        model.addAttribute("users",userRepository.findAll());

        return "list";
    }
}
