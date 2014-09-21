public class PixMaker {
  private short red = 0;
  private short green = 0;
  private short blue = 0;
  private short[] pixObject = new short[3];
  
  public short totalRed;
  public short totalGreen;
  public short totalBlue;
  public short neighbors;
  public short gxRed;
  public short gyRed;
  public short gxGreen;
  public short gyGreen;
  public short gxBlue;
  public short gyBlue;
  public long energy;

  public PixMaker(){
    energy = 0;
    totalRed = 0;
    totalGreen = 0;
    totalBlue = 0;
    neighbors = 0;
    gxRed = 0;
    gyRed = 0;
    gxGreen = 0;
    gyGreen = 0;
    gxBlue = 0;
    gyBlue = 0;

    pixObject[0] = red;
    pixObject[1] = green;
    pixObject[2] = blue;
  }
  public short getRed(){
    return pixObject[0];
  }
  public short getGreen(){
    return pixObject[1];

  }
  public short getBlue(){
    return pixObject[2];
  }
  public void setRed(short x){
    pixObject[0] = x;
  }
  public void setGreen(short x){
    pixObject[1] = x;
  }
  public void setBlue(short x){
    pixObject[2] = x;
  }
  /*public boolean equals(PixMaker y){
    return this.getRed() == y.getRed() && this.getGreen() == y.getGreen() && this.getBlue() == y.getBlue();
  }*/
}