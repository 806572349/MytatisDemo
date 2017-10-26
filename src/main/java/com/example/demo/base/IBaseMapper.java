package com.example.demo.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 80657 on 2017/10/26.
 */
public interface IBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}