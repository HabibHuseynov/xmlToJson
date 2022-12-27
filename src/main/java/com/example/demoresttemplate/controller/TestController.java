package com.example.demoresttemplate.controller;


import com.example.demoresttemplate.entity.ValCurs;
import com.example.demoresttemplate.entity.ValType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@RequestMapping("/")
@RestController
public class TestController {


    @GetMapping
    public ResponseEntity getXML() throws JsonProcessingException {

        RestTemplate restTemplate = new RestTemplate();
        XmlMapper xmlMapper = new XmlMapper();
        ObjectMapper objectMapper = new ObjectMapper();

        //
        Date date = Date.valueOf(LocalDate.now());
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String str = formatter.format(date);

        //
        String url="https://www.cbar.az/currencies/{date}"+".xml";
        ResponseEntity<String> xtr = restTemplate.getForEntity(url,String.class,str);


        ValCurs val =xmlMapper.readValue(xtr.getBody(), ValCurs.class);
        String json = objectMapper.writeValueAsString(val);

        return ResponseEntity.ok(json);

    }
}