package com.is.mapper;

import com.is.pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /**
     * 查询所有
     */
    List<Brand> selectAll();

    /**
     * 查看详情：按id
     */
    Brand selectById(int id);

    /**
     * 条件查询
     */

    List<Brand> selectByCondition(Map map);

    /**
     * 单条件查询
     */
    List<Brand> selectByConditionSingle(Brand brand);



}
