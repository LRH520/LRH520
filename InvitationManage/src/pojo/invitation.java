package pojo;

public class invitation {
     private int id;
     private String title;
     private String summary;
     private String author;
     private String createdate;
	public invitation() {
		super();
	}
	public invitation(int id, String title, String summary, String author,
			String createdate) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "invitation [id=" + id + ", title=" + title + ", summary="
				+ summary + ", author=" + author + ", createdate=" + createdate
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
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
