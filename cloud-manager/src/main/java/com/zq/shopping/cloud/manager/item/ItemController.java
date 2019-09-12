package com.zq.shopping.cloud.manager.item;

import com.zq.shopping.cloud.ims.item.Item;
import com.zq.shopping.cloud.ims.item.ItemApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
	@Autowired
	private ItemApi itemApi;
	
	@RequestMapping("/queryAll")
	public List<Item> queryAll(){
		return itemApi.queryAll();
	}
}
