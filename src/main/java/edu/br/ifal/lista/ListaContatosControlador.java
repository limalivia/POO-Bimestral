package edu.br.ifal.lista;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListaContatosControlador{

@RequestMapping("/")
public ModelAndView index() {
    return new ModelAndView("adicionar.html");
}

}