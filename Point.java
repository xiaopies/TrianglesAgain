public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distanceTo(Point other){
    double x1 = other.x;
    double x2 = this.x;
    double y1= other.y;
    double y2 = this.y;
    double x = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    return (x);
  }
  public boolean equals(Point other){
    return other ! = null && distanceTo(other) ==0;
  }



}
