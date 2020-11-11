package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    //查询所有产品信息
    @Select("select * from product")
    List<Product> findAll() throws Exception;
}
