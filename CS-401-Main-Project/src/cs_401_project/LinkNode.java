package cs_401_project;

public class LinkNode {

	private String info;
	private LinkNode link;
	
	public LinkNode(String info, LinkNode link) {
		super();
		this.info = info;
		this.link = link;
	}

	public LinkNode(String info) {
		this.info = info;
		this.link = null;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public LinkNode getLink() {
		return link;
	}

	public void setLink(LinkNode link) {
		this.link = link;
	}
}
