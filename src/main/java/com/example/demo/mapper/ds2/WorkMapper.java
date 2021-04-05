package com.example.demo.mapper.ds2;

import com.example.demo.entry.po.Work;
import com.example.demo.entry.po.WorkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkMapper {
    int countByExample(WorkExample example);

    int deleteByExample(WorkExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Work record);

    int insertSelective(Work record);

    List<Work> selectByExample(WorkExample example);

    Work selectByPrimaryKey(Integer wid);

    List<Work> selectAll();

    int updateByExampleSelective(@Param("record") Work record, @Param("example") WorkExample example);

    int updateByExample(@Param("record") Work record, @Param("example") WorkExample example);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);
}