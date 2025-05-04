/*
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/introduce")
    public String hello() {
        return "안녕하세요 제 이름은 황명하입니다!";
    }
}*/


/*
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/introduce")
    public String hello(@RequestParam("name") String name) {
        return "안녕하세요 제 이름은 " + name + "입니다!";
    }
}*/


package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/json")
    public information jsonResponse() {
        information data = new information();
        data.Age(23);
        data.Name("황명하");
        return data;
    }
}

class information {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void Age(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void Name(String name) {
        this.name = name;
    }
}

