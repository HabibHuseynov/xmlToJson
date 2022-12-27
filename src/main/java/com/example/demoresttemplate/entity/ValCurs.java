package com.example.demoresttemplate.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.sql.Date;
import java.util.List;

@JacksonXmlRootElement(localName = "ValCurs")
public class ValCurs {


    @JacksonXmlProperty(isAttribute = true, localName = "Date")
    private String date;


    @JacksonXmlProperty(isAttribute = true, localName = "Name")
    private String name;



    @JacksonXmlProperty(isAttribute = true, localName = "Description")
    private String Description;

    @JacksonXmlElementWrapper(localName = "ValType",useWrapping = false)
    @JacksonXmlProperty(localName = "ValType")
    private List<ValType> valType;

    public ValCurs() {
    }

    public ValCurs(String date, String name, String description, List<ValType> valType) {
        this.date = date;
        this.name = name;
        Description = description;
        this.valType = valType;
    }


    public String getDate() {
        return date;
    }

    public ValCurs setDate(String date) {
        this.date = date;
        return this;
    }

    public String getName() {
        return name;
    }

    public ValCurs setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return Description;
    }

    public ValCurs setDescription(String description) {
        Description = description;
        return this;
    }

    public List<ValType> getValType() {
        return valType;
    }

    public ValCurs setValType(List<ValType> valType) {
        this.valType = valType;
        return this;
    }
}
