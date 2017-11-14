package Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.InvitationMapper;

import pojo.invitation;
import pojo.reply_detail;
@Service
public class InvitationServiceimpl implements InvitationService{
	@Autowired
	private InvitationMapper im;

	public InvitationMapper getIm() {
		return im;
	}

	public void setIm(InvitationMapper im) {
		this.im = im;
	}

	@Override
	public List<invitation> getAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return im.getAll(map);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return im.count();
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return im.del(id);
	}

	@Override
	public List<reply_detail> All() {
		// TODO Auto-generated method stub
		return im.All();
	}

	@Override
	public int insert(reply_detail r) {
		// TODO Auto-generated method stub
		return im.insert(r);
	}

}
