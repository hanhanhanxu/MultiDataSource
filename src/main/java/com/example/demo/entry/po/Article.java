package com.example.demo.entry.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Long id;

    private String title;

    private String intro;

    private String img;

    private Integer sign;

    private Date createTime;

    private Date updateTime;

    private Byte isactive;

    private String content;
}