package com.example.puasa.controller;

import com.example.puasa.service.PuasaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/depanNya")
public class PuasaController {

    private PuasaService puasaService;
    public ResponseEntity<?> ContohApi (){
        ResponseEntity responseEntity = null;



        return responseEntity;
    }

    public ResponseEntity ContohApiDua (){
//        ResponseEntity responseEntity = null;
        ResponseEntity<?> responseEntity = null;
        return responseEntity;
    }


}
