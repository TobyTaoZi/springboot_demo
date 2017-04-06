package com.demo.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by taojingjing on 2017/4/6.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>{
}
