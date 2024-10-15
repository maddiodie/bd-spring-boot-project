package com.bloomtech.springboot.controllers;

// this class will hold controllers for our server
//
// we're going to keep all of our controllers in one to keep it simple

import com.bloomtech.springboot.models.theDataForRequest;
import org.springframework.web.bind.annotation.*;

// data may be sent with an HTTP request:
//
// GET or DELETE request - data is in a URL query parameter (?name=value) - @RequestParam
// POST or PUT request - data is in the request body - @RequestBody
// HTTP requests typically have JSON formatted data in the request body
// java uses objects, not JSON ...
// the server automatically converts JSON to/from objects ...
// in Postman you must put data for a POST in the request body before you send the request

@RestController // tells the server that there are REST controller methods in this class
public class myControllers {

    // define a method to handle HTTP GET requests for the root URL path ("/")
    @GetMapping(value="/") // the method that follows will handle HTTP GET requests for "/"
    public String rootPathMethod() { // the method name can be anything you want
        System.out.println("Controller method for GET with path '/' was executed.");
        return "Root path method was called.";
    }

    // define a method to handle HTTP GET requests for URL path "/startrek" ...
    // with a query parameter of "character=whoTheyAre" ...
    // to access data in a query parameter - use @RequestParam annotation in method
    // parameter list
    //
    // @RequestParam data-type name-of-query-parameter
    @GetMapping(value="/startrek")
    public String anyNameYouWant(@RequestParam String whoTheyAre) {
        System.out.println("Controller method for GET with '/startrek' was executed.");
        return "Star Trek method was called with parameter value: " + whoTheyAre + ".";
    }

    // define a method to handle HTTP GET requests for URL path "/startrek/spock"
    @GetMapping(value="/startrek/spock")
    public String anyNameYouWant2() {
        System.out.println("Controller method for GET with '/startrek/spock' was executed.");
        return "Live long and prosper!";
    }

    // define a method to handle HTTP POST requests for URL path "/"
    // @RequestBody allows access to the data in the request body
    //
    // @RequestBody class-name object-name
    @PostMapping(value="/")
    public String wilberPost(@RequestBody theDataForRequest dataPassedIn) {
        System.out.println("Controller method for POST with '/' was executed.");
        System.out.println("The data sent with tht e request was: " + dataPassedIn + ".");
        return "Mr. Ed was a talking horse on TV in the 1960's.";
    }

}
