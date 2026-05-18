package com.example.ex04.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@JacksonXmlRootElement(localName = "Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    private String id;
    private String name;
    private double avrScore;

}