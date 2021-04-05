package com.example.demo.mapper.ds2;

import com.example.demo.entry.po.Mywork;
import com.example.demo.entry.po.MyworkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyworkMapper {
    int countByExample(MyworkExample example);

    int deleteByExample(MyworkExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Mywork record);

    int insertSelective(Mywork record);

    List<Mywork> selectByExample(MyworkExample example);

    Mywork selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Mywork record, @Param("example") MyworkExample example);

    int updateByExample(@Param("record") Mywork record, @Param("example") MyworkExample example);

    int updateByPrimaryKeySelective(Mywork record);

    int updateByPrimaryKey(Mywork record);
}