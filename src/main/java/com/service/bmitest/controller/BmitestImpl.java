package com.service.bmitest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-08T03:21:40.797Z")

@RestSchema(schemaId = "bmitest")
@RequestMapping(path = "/bmitest", produces = MediaType.APPLICATION_JSON)
public class BmitestImpl {

    @Autowired
    private BmitestDelegate userBmitestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userBmitestDelegate.helloworld(name);
    }

}
