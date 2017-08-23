package me.anna.NIFB.controllers;


import me.anna.NIFB.UserRepository;
import me.anna.NIFB.models.FizzBuzz;
import me.anna.NIFB.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;


    // Show Home Page
    @GetMapping("/")
    public String showHome(Model model)
    {
        return "CoverTemplateforBootstrap";
    }

    // Show Welcome Page
    @GetMapping("/welcome")
    public String showWelcome(Model model)
    {
        String myMessage = "Welcome to The New and Improved Fizz Buzz!";
        model.addAttribute("message", myMessage);
        return "welcome";
    }


    @GetMapping("/play")
    public String startPlay(Model model)
    {
        model.addAttribute("user",new User());
      //  model.addAttribute("fizzbuzz",new FizzBuzz());
        return "play";
    }

    @PostMapping("/play")
   public String showResult(@Valid @ModelAttribute("user") User user, BindingResult result)//, @ModelAttribute("fizzbuzz") FizzBuzz fizzbuzz)
    {
        if(result.hasErrors())
        {
            return "play";
        }

        user.setFizzString(user.getNumber());

// Display FizzBuzz string on the console
//        System.out.print("This is a string of numbers; " + user.getFizzString()); //fizzbuzz.setFizzBuzz(user.getNumber()));  //+ user.getFizzString());

        userRepository.save(user);
        return "result";
    }


}
