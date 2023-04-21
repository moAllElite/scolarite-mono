package com.groupeisi.gestionscolaire.controller;



import com.groupeisi.gestionscolaire.model.User;
import com.groupeisi.gestionscolaire.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@AllArgsConstructor
public class UserController {
    public final IUserRepository repository;
    @GetMapping(path="/index")
    public String users(Model model,
                @RequestParam(name = "page",defaultValue = "0") int page,
                @RequestParam(name = "size",defaultValue = "5") int size,
                @RequestParam(name = "keyword",defaultValue = "") String keyword){
        Page<User> pageUsers=repository.findByLastNameContains(keyword,PageRequest.of(page, size));
        model.addAttribute("listeUsers",pageUsers.getContent());
        model.addAttribute("pages",new int[pageUsers.getTotalPages()]);
        model.addAttribute("currentPage",page);
        return "users";
    }
    @GetMapping(path = "/add")
    public String add(Model model){
        User currentUser=new User();
        User newUser=repository.save(currentUser);
        return "add-user";
    }
    @GetMapping("/delete")
    public String delete(Long id,String keyword,int page ){
        repository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping(path = "/")
    public String suit(Model model){
        return "redirect:/home";
    }
    @GetMapping(path = "/welcome")
    public String home(Model model){
        return "home";
    }
}
