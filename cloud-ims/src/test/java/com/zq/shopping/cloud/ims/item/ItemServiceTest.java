package com.zq.shopping.cloud.ims.item;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ItemServiceTest {
	@Autowired
	private ItemApi itemService;
	
	@Test
	public void queryAll() {
		System.out.println(itemService.queryAll());
	}
}