package com.is.mapper;

import com.is.pojo.Brand;

import java.util.List;

public interface BrandMapper {
    /**
     * 查询所有
     */
    List<Brand> selectAll();

    /**
     * 查看详情：按id
     */
    Brand selectById(int id);
}
