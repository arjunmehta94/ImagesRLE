/* Run Object Abstract Data Type */

public class Run{

	public short red;
  	public short green;
  	public short blue;
	public int length;

	public Run(){
		red = 0;
		green = 0;
		blue = 0;
		length = 1;
	}

	public Run(int length, short red, short green, short blue){
		this.length = length;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	public int getLength(){
		return length;
	}
	public short getRed(){
		return red;
	}
	public short getGreen(){
		return green;
	}
	public short getBlue(){
		return blue;
	}
	public void setLength(int x){
		length = x;
	}
	public void setRed(short x){
		red = x;
	}
	public void setGreen(short x){
		green = x;
	}
	public void setBlue(short x){
		blue = x;
	}
	public String toString(){
		String result = "[ ";
		result += "(" + red + ", " + green + ", " + blue + ") , " + length + "]";
		return result;
	}
}