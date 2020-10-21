package com.yxfmain.demo.dao;

import com.yxfmain.demo.dao.entity.ImasAssetInfo;

public interface ImasAssetInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImasAssetInfo record);

    int insertSelective(ImasAssetInfo record);

    ImasAssetInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImasAssetInfo record);

    int updateByPrimaryKey(ImasAssetInfo record);
}