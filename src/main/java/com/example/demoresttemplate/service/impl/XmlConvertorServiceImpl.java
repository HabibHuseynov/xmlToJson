package com.example.demoresttemplate.service.impl;

import com.example.demoresttemplate.entity.ValCurs;
import com.example.demoresttemplate.service.XmlConvertorService;
import com.example.demoresttemplate.util.DateFormatter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.time.LocalDate;

@Service
public class XmlConvertorServiceImpl implements XmlConvertorService {

    private final RestTemplate restTemplate;

    public XmlConvertorServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String convertXmlToJson() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        String date = DateFormatter.dateFormat(Date.valueOf(LocalDate.now()));

        String url="https://www.cbar.az/currencies/{date}"+".xml";

        ValCurs valcurs = restTemplate.getForEntity(url,ValCurs.class,date).getBody();

        return objectMapper.writeValueAsString(valcurs);

    }
}
