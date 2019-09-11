package com.zq.shopping.cloud.ims.item;

public enum ItemStatus {
	disabled("未上架"),
	enabled("已上架");
	private String desc;

	private ItemStatus(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	
	public String getKey(){
		return name();
	}
}
