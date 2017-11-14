package pojo;

public class reply_detail {
     private int id;
     private int invid;
     private String content;
     private String author;
     private String createdate;
	public reply_detail() {
		super();
	}
	public reply_detail(int id, int invid, String content, String author,
			String createdate) {
		super();
		this.id = id;
		this.invid = invid;
		this.content = content;
		this.author = author;
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "reply_detail [id=" + id + ", invid=" + invid + ", content="
				+ content + ", author=" + author + ", createdate=" + createdate
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInvid() {
		return invid;
	}
	public void setInvid(int invid) {
		this.invid = invid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
}
