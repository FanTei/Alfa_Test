package AlfaTest.AlfaTest.model;

import lombok.Data;

import java.util.Map;

@Data
public class Rates {
    private String disclaimer;
    private String license;
    private Integer timestamp;
    private String base;
    private Map<String, Double> rates;
}
