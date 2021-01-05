package mx.com.tixsoft.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

    @GetMapping("home")
    public ModelAndView index()
    {
        ModelAndView vista = new ModelAndView();
        String titulo = "Hola mundo";
        vista.setViewName("index");
        vista.addObject("titulo", titulo);
        return vista;
    }
    
}