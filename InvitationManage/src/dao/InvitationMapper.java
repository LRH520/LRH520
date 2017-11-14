package dao;

import java.util.List;
import java.util.Map;

import pojo.invitation;
import pojo.reply_detail;

public interface InvitationMapper {
	// 分页
	public List<invitation> getAll(Map<String, Object> map);

	// 显示总数

	public int count();

	// 删除
	public int del(int id);

	// 查看
	public List<reply_detail> All();
	
	//新增
	public int insert(reply_detail r);
}
