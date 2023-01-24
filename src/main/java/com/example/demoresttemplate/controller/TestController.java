package com.example.demoresttemplate.controller;


import com.example.demoresttemplate.service.XmlConvertorService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TestController {

    private final XmlConvertorService xmlConvertorService;

    public TestController(XmlConvertorService xmlConvertorService) {
        this.xmlConvertorService = xmlConvertorService;
    }

    @GetMapping
    public ResponseEntity getXML() throws JsonProcessingException {
        return ResponseEntity.ok(xmlConvertorService.convertXmlToJson());

    }
}
