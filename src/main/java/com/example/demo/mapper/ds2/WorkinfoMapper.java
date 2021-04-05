package com.example.demo.mapper.ds2;

import com.example.demo.entry.po.Workinfo;
import com.example.demo.entry.po.WorkinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkinfoMapper {
    int countByExample(WorkinfoExample example);

    int deleteByExample(WorkinfoExample example);

    int deleteByPrimaryKey(String winfoid);

    int insert(Workinfo record);

    int insertSelective(Workinfo record);

    List<Workinfo> selectByExampleWithBLOBs(WorkinfoExample example);

    List<Workinfo> selectByExample(WorkinfoExample example);

    Workinfo selectByPrimaryKey(String winfoid);

    int updateByExampleSelective(@Param("record") Workinfo record, @Param("example") WorkinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Workinfo record, @Param("example") WorkinfoExample example);

    int updateByExample(@Param("record") Workinfo record, @Param("example") WorkinfoExample example);

    int updateByPrimaryKeySelective(Workinfo record);

    int updateByPrimaryKeyWithBLOBs(Workinfo record);

    int updateByPrimaryKey(Workinfo record);

    Workinfo selectByWid(Integer wid);
}