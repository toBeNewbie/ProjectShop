package com.newbie.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.newbie.shop.pojo.TbBrand;
import com.newbie.shop.pojo.TbBrandExample;

public interface TbBrandMapper {
    int countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    List<TbBrand> selectByExample(TbBrandExample example);

    TbBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);
    
    //获取下拉品牌
    List<Map> selectOptionList();
}