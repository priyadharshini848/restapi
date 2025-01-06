package com.example.priya.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Responsecontroller 
{
    @GetMapping("/abc")
    public Response method()
    {
        Response a = new Response(1, "NULL", "def", new Date());
        return a;
    }
    @Value("${name}")
    private String defaultname;
    @GetMapping("/valueannotation")
    
    public String valueannotation()
    {
        return defaultname;
    }
}
