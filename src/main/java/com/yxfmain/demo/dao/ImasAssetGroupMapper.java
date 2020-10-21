package com.yxfmain.demo.dao;

import com.yxfmain.demo.dao.entity.ImasAssetGroup;

public interface ImasAssetGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImasAssetGroup record);

    int insertSelective(ImasAssetGroup record);

    ImasAssetGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImasAssetGroup record);

    int updateByPrimaryKey(ImasAssetGroup record);
}