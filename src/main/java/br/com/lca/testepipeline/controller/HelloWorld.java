package br.com.lca.testepipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }
}
