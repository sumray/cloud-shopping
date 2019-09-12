package com.zq.shopping.cloud.ims.item;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("cloud-ims")
public interface ItemApi {
	@RequestMapping("/query")
	List<Item> queryAll();
}
