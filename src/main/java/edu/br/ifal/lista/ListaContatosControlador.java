package edu.br.ifal.lista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListaContatosControlador{
@Autowired
    Repositorio repositorio ;

@RequestMapping("/")
public ModelAndView index() {
    return new ModelAndView("adicionar.html");
}
@RequestMapping("/listar")
public ModelAndView listar(){
    repositorio.findAll();
 return new ModelAndView("listar");
}
@RequestMapping("/Salvar")
public ModelAndView Salvar( Contato contato){
    repositorio.save(contato);
 return new ModelAndView("redirect:/listar");
}
}