package com.example.priya.Controller;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response
 {
    @JsonProperty("STUDENTID")
    private int id;
    @JsonIgnore
    private String firstname;
    private String lastname;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date date;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
   
    public Response(int id, String firstname, String lastname, Date date) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
    }
    


}
