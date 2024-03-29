package com.example.demoresttemplate.entity;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "ValCurs")
public class ValType {
    @JacksonXmlProperty(isAttribute = true, localName = "Type")
    private String type;

    @JacksonXmlElementWrapper(localName = "Valute",useWrapping = false)
    @JacksonXmlProperty(localName = "Valute" )
    private List<Valute> valute;

    public ValType() {
    }

    public ValType(String type, List<Valute> valute) {
        this.type = type;
        this.valute = valute;
    }

    public String getType() {
        return type;
    }

    public ValType setType(String type) {
        this.type = type;
        return this;
    }

    public List<Valute> getValute() {
        return valute;
    }

    public ValType setValute(List<Valute> valute) {
        this.valute = valute;
        return this;
    }
}
