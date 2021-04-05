package com.example.demo.entry.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Work {
    private Integer wid;

    private String wtitle;

    private String wintro;

    private String wimg;

    private Date createTime;

    private Date updateTime;
}