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
    x1 = other.x;
    x2 = this.x;
    y1= other.y;
    y2 = other.y;
    double x = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    double h = Math.round(x * 10000);
    return (h/10000);
  }
  


}
