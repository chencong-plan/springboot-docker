package cc.ccoder.sprintboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @RequestMapping("/hello")
    public String index() {
        return "hello Docker";
    }


    @RequestMapping("/hello/{name}")
    public String index(@PathVariable String name) {
        return "hello " + name;
    }
}
