package com.zq.shopping.cloud.ims.item;

import com.zq.framework.entity.IdEntity;
import com.zq.framework.mybatis.TypeAlias;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "ITEM")
public class Item extends IdEntity implements TypeAlias {
	private String title;   //商品标题
	private Long categoryId;    //分类id
	private ItemStatus status;  //商品状态
	private Date createTime;
	private String desc;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public ItemStatus getStatus() {
		return status;
	}

	public void setStatus(ItemStatus status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Item{" +
				"title='" + title + '\'' +
				", categoryId=" + categoryId +
				", status=" + status +
				", createTime=" + createTime +
				", desc='" + desc + '\'' +
				'}';
	}
}
