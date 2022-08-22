package com.fonke.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.Date;

@Data
@JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
public class BoardDto {

    private long id;
    private String title;
    private String content;
    private String author;
    private Date createdAt;
}
