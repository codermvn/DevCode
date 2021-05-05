package com.deepak.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.deepak.test.exception.TFSBaseException;
import com.deepak.test.service.CheckService;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

	@Autowired
	CheckService service;
	
	@Value("${app.version}")
    private String version;
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(method = RequestMethod.GET, path="/test")
    public String getResponse(@RequestParam(value="input1",defaultValue = "Deepak") String name){
        return "Hi"+name+"appVersion:"+version;
    }
    
    @RequestMapping(method = RequestMethod.GET, path="/check")
    public String getExceptioCheck(@RequestParam(value="input1") String input) throws TFSBaseException{
        return service.Howdy(input);
    }
}
