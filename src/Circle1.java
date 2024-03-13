public class Circle1 {
    static double area;
    double area2;
    static void area(double radius){
        area=(3.14*radius*radius);           //static method uses static variable
        System.out.println("Area of the cirle with radius "+radius+" is "+area);
    }
    void area2(double radius2){
        area2=(3.14*radius2*radius2);        //local method uses local variable
        System.out.println("Area of the circle with given radius "+radius2+" is "+area2);
    }
    public static void main(String[] args) {
        area(12);                      //static content in static area so no object to be created.
        Circle1 c=new Circle1();               //object created to call instance content in static area.
        c.area2(3);                  //instance content called in static area.
    }
}

