package com.example.demoresttemplate.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "Valute")
public class Valute {

    @JacksonXmlProperty(isAttribute = true, localName = "Code")
    private String code;
    @JacksonXmlProperty(localName = "Nominal")
    private String nominal;
    @JacksonXmlProperty(localName = "Name")
    private String name;
    @JacksonXmlProperty(localName = "Value")
    private Double value;



    public Valute() {
    }


    public Valute( String nominal, String name, Double value) {
        //this.code = code;
        this.nominal = nominal;
        this.name = name;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public Valute setCode(String code) {
        this.code = code;
        return this;
    }

    public String getNominal() {
        return nominal;
    }

    public Valute setNominal(String nominal) {
        this.nominal = nominal;
        return this;
    }

    public String getName() {
        return name;
    }

    public Valute setName(String name) {
        this.name = name;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public Valute setValue(Double value) {
        this.value = value;
        return this;
    }
}
