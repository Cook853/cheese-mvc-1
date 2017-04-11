//package org.launchcode.controllers;
//
//import org.launchcode.models.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import javax.validation.constraints.NotNull;
//
///**
// * Created by Lauren on 3/23/2017.
// */
//
//@Controller
//@RequestMapping("user")
//public class UserController {
//
//    @RequestMapping(value = "add", method = RequestMethod.GET)
//    public String add(Model model) {
//        model.addAttribute("title", "Add User");
//        model.addAttribute(new User());
//        return "users/add";
//    }
//
//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public String add(@ModelAttribute @Valid User user,
//                      Error errors, Model model,
//                      @RequestParam @NotNull String verify) {
//
//        if (verify.equals(user.getPassword())) {
//            model.addAttribute("title", "Add User");
//            model.addAttribute("newUser", user.getUsername());
//            model.addAttribute(user);
//            UserData.add(user);
//            return "users/index";
//        } else {
//            model.addAttribute("title", "Add User");
//            model.addAttribute("non-match", "Passwords do not match");
//            model.addAttribute(user);
//            return "users/add";
//        }
//    }
//}