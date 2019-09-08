package com.zq.shopping.cloud.ims.item;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ITEM")
public class Item {
	@Id
	private Long id;

}
