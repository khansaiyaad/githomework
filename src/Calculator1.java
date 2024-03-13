public class Calculator1 {
    static Calculator1 c2= new Calculator1();//creates static object to be accessed by all class members.
    static int a = 30;
    static int b = 60;
    static int result;
    int c=200;
    static void add() {                                          //no return type and static
        result = a + b;
        System.out.println("sum of number " + a + " and " + b + " is " + result);
    }
    static void subtract() {                                     //no return type and static
        result = a - b;
        System.out.println("subtraction of " + a + " and " + b + " is " + result);
    }
    void multiplication(int a, int b) {                        //no return type and parameterised.
        System.out.println("multiplication of " + a + " and " + b + " is " + (a * b));
        System.out.println(c2.c); //calling static content in instance method -object created.
    }
    void division(int a,int b){                                 //no return type and parameterised.
        System.out.println(a+ "/" +b+ " is " +(a/b));
    }
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        System.out.println(c2.c);   //called instance content in static area so required to create an object.
        add();                      //calling static content in static area no changes required.
        subtract();                   //calling static content in static area no changes required.
        c1.multiplication(3, 4);   //called instance content in static area so required to create an object.
        c1.division(20,5);   //called instance content in static area so required to create an object.
    }
}

