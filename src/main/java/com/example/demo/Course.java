package com.example.demo;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.Value;



@Data
public class Course {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nazwa")
    private String name;
    @JsonProperty("ects")
    private Integer points;
    @JsonProperty("sala")
    private Integer room;
    @JsonProperty("egzamin")
    private Boolean exam;

    void setId(Integer courseId){
        this.id = courseId;
    }

}