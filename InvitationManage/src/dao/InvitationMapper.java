package dao;

import java.util.List;
import java.util.Map;

import pojo.invitation;
import pojo.reply_detail;

public interface InvitationMapper {
	// ��ҳ
	public List<invitation> getAll(Map<String, Object> map);

	// ��ʾ����

	public int count();

	// ɾ��
	public int del(int id);

	// �鿴
	public List<reply_detail> All();
	
	//����
	public int insert(reply_detail r);
}
