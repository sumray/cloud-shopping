package com.zq.shopping.cloud.ims.item;


import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface ItemMapper extends BaseMapper<Item> {
	List<Item> queryAll();
}
