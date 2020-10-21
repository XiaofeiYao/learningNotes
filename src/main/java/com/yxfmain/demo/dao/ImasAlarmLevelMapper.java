package com.yxfmain.demo.dao;

import com.yxfmain.demo.dao.entity.ImasAlarmLevel;

public interface ImasAlarmLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImasAlarmLevel record);

    int insertSelective(ImasAlarmLevel record);

    ImasAlarmLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImasAlarmLevel record);

    int updateByPrimaryKey(ImasAlarmLevel record);
}