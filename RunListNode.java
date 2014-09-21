/* RunListNode.java */
/* represents each Run Node of a Run List */

public class RunListNode{

	public int[] item;
	public RunListNode next;
	public RunListNode prev;

	public RunListNode(){
		
		item = new int[4];
		prev = null;
		next = null;
	}

	public RunListNode(int[] i){
		item = i;
		prev = null;
		next = null;

	}

	public int[] getitem(){
		return item;
	}

	public int getLength(){
		return item[0];
	}

	public short getRed(){
		return (short)item[1];
	}

	public short getGreen(){
		return (short)item[2];

	}

	public short getBlue(){
		return (short)item[3];
	}

	public void setLength(int x){
		item[0] = x;
	}

	public void setRed(short x){
		item[1] = x;
	}

	public void setGreen(short x){
		item[2] = x;
	}

	public void setBlue(short x){
		item[3] = x;
	}
	public RunListNode next(){
		return this.next;
	}
	public RunListNode prev(){
		return this.prev;
	}


















}