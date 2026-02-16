package com.tiket.demoTiket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;




 
@Controller
public class WelcomeController {

    
  
    @GetMapping
    public String wolcome(){
        return "welcome";
    }


    @GetMapping("/cursos")
    
    public String cursos(){
        return "cursos"; // toma el parametro "cursos" como el nome de la vista que se
        //  encuentra en template
    }

    @GetMapping({"/cursos/{curso}/{categoria}", "/cursos/{curso}"})//paso de variable
    @ResponseBody
    public String mostrarCurso(
        @PathVariable String curso,
        @PathVariable(required =  false) String categoria //para variable no requerida
         ){

        if (categoria != null){
            return "Curso "+ curso + "categoria " + categoria;
        }
        else{
            return "Curso "+ curso ;
        }
        
    }



    
}