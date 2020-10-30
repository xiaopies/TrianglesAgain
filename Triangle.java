public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  public double getPerimeter(){

    double a = v1.distanceTo(v2);
    double b = v1.distanceTo(v3);
    double c = v3.distanceTo(v2);
    return (a+b+c);
  }
  public double getArea(){
    double a = v1.distanceTo(v2);
    double b = v1.distanceTo(v3);
    double c = v3.distanceTo(v2);

    double s = (getPerimeter() / 2.0);
    double y = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return (y);
  }


  }
}
