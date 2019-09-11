package com.zq.shopping.cloud.ims.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> queryAll() {
		return itemMapper.queryAll();
	}
}
