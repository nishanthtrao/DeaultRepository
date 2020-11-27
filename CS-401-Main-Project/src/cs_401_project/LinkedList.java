package cs_401_project;

public class LinkedList {

	private LinkNode head;
	private LinkNode tail;

	public LinkNode getHead() {
		return head;
	}

	public void setHead(LinkNode head) {
		this.head = head;
	}
	
	public LinkNode getTail() {
		return tail;
	}

	public void add(String info) {
		LinkNode node = new LinkNode(info); 
		if (this.head == null) { 
			this.head = node;
			this.tail = node;
		} else {
			tail.setLink(node);
			tail = node;
		}
	}

	@Override
	public String toString() {
		String result = "";
		LinkNode current = head;
		while(current != null){
			result += current.getInfo();
			if(current.getLink() != null){
				result += ", ";
			}
			current = current.getLink();
		}
		return "[" + result + "]";
	}
}
