package br.com.projeto.demo04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FormularioController {

    @GetMapping
    public ModelAndView hello() {
        var mv = new ModelAndView("hello");
        return mv;
    }

    @PostMapping
    public void teste (){

    }
}
