package com.example.demo.mapper.ds2;

import com.example.demo.entry.po.Myworkinfo;
import com.example.demo.entry.po.MyworkinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyworkinfoMapper {
    int countByExample(MyworkinfoExample example);

    int deleteByExample(MyworkinfoExample example);

    int deleteByPrimaryKey(String winfoid);

    int insert(Myworkinfo record);

    int insertSelective(Myworkinfo record);

    List<Myworkinfo> selectByExampleWithBLOBs(MyworkinfoExample example);

    List<Myworkinfo> selectByExample(MyworkinfoExample example);

    Myworkinfo selectByPrimaryKey(String winfoid);

    int updateByExampleSelective(@Param("record") Myworkinfo record, @Param("example") MyworkinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Myworkinfo record, @Param("example") MyworkinfoExample example);

    int updateByExample(@Param("record") Myworkinfo record, @Param("example") MyworkinfoExample example);

    int updateByPrimaryKeySelective(Myworkinfo record);

    int updateByPrimaryKeyWithBLOBs(Myworkinfo record);

    int updateByPrimaryKey(Myworkinfo record);
}