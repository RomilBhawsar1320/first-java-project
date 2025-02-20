
class calculatorOps{

    public int  add(int a , int b){

        return a+b;
    }

    public int  sub(int a , int b){

        return a-b;
    }

    public int  mul(int a , int b){

        return a*b;
    }
}




public class Calculator{

    public static void main(String[] args) {
        

        calculatorOps obj = new calculatorOps();

        System.out.println(obj.add(3, 4));
        
}
}