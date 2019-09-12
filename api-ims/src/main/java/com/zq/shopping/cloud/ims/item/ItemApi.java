package com.zq.shopping.cloud.ims.item;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "cloud-ims", path = "/item-service")
public interface ItemApi {
	@RequestMapping("/query")
	List<Item> queryAll();
}
