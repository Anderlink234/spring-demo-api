package com.demo.demo.api.controller;


import com.demo.demo.api.logic.Tools;
import com.google.gson.JsonObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApiController {

    @RequestMapping(value = "${service.path}",
            method = RequestMethod.GET)
    ResponseEntity<JsonObject> getHostName() {
        return new ResponseEntity<JsonObject>(Tools.getHostNameAndIp(), HttpStatus.OK);
    }


}
