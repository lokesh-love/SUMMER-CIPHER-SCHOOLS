class lecture3{
    public static void main(String args[]){
        int a=5;
        int b=6;
        System.out.println("the value of a is : "+a);
        System.out.println("the value of b is : "+b);

        byte c=10;
        System.out.println("value of c is : "+ c);

        //widening(Narrowing/Upcasting)
        int d=c;
        System.out.println("Value of d is : "+d);

        //Implicit Typecasting or Narrowing or Down-casting
        byte c2=(byte)129; 
        System.out.println("c2 is : "+c2);

        byte c3=(byte)256; 
        System.out.println("c2 is : "+c3);
    }
