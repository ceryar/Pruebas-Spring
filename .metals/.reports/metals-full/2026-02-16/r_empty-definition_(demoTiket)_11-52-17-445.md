error id: file://<WORKSPACE>/src/main/java/com/tiket/demoTiket/controller/WelcomeController.java:java/lang/String#
file://<WORKSPACE>/src/main/java/com/tiket/demoTiket/controller/WelcomeController.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 332
uri: file://<WORKSPACE>/src/main/java/com/tiket/demoTiket/controller/WelcomeController.java
text:
```scala
package com.tiket.demoTiket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




 
@Controller
public class WelcomeController {

    
  
    @GetMapping
    public String wolcome(){
        return "welcome";
    }


    @GetMapping("/cursos")
    public Strin@@g cursos(){
        return "cursos"; // toma el parametro "cursos" como el nome de la vista que se
        //  encuentra en template
    }


    
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#