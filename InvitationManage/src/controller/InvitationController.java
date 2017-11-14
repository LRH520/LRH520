package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.invitation;
import pojo.reply_detail;

import Service.InvitationService;

@Controller
public class InvitationController {
	@Autowired
	private InvitationService is;

	public InvitationService getIs() {
		return is;
	}

	public void setIs(InvitationService is) {
		this.is = is;
	}

	@RequestMapping("/getAll")
	public String getAll(@RequestParam(defaultValue = "1") int pageIndex,
			HttpServletRequest request, String title) {
		if (pageIndex < 1) {
			return "index.jsp";
		} else {
			System.out.println("111");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("pageno", (pageIndex - 1) * 2);
			map.put("size", 2);
			map.put("title", title);
			List<invitation> list = is.getAll(map);
			request.getSession().setAttribute("list", list);
			request.getSession().setAttribute("pageIndex", pageIndex);
			int count = is.count();
			int countpage = count % 2 == 0 ? count / 2 : count / 2 + 1;
			request.getSession().setAttribute("countpage", countpage);
			return "index.jsp";

		}
	}

	@RequestMapping("/del")
	public String del(@RequestParam(defaultValue = "1") int pageIndex,
			HttpServletRequest request, String title) {
		int id = Integer.parseInt(request.getParameter("id"));
		int count = is.del(id);
		if (count > 0) {
			return getAll(pageIndex, request, title);

		} else {
			return getAll(pageIndex, request, title);
		}
	}

	@RequestMapping("All")
	public String All(HttpServletRequest request) {
		List<reply_detail> list = is.All();
		request.setAttribute("list", list);
		return "index1.jsp";
	}
	@RequestMapping("/insert")
	public String insert(HttpServletRequest request)
	{
		int invid=Integer.parseInt(request.getParameter("invid"));
		String content=request.getParameter("content");
		String createdate=request.getParameter("createdate");
		String author=request.getParameter("author");
		reply_detail r=new reply_detail();
		r.setContent(content);
		r.setAuthor(author);
		r.setCreatedate(createdate);
		r.setInvid(invid);
		is.insert(r);
		return All(request);
		
	}
	
}
