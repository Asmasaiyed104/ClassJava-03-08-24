// A method consists of method name, parameters, return value type  and body.
// modifier returnValueType methodName(list of parameters) {
//// Method body;
//}


public class SumMethod {

    public static void main(String[] args) {
        System.out.println("Sum of 1 to 100" + sum(1,100) );
        System.out.println("Sum of 37 to  46" + sum(37,46));
    }

    public static int sum(int i1 , int i2){
        int result = 0;
        for(int i = i1; i <= i2; i++)
            result += i;
        return result;
    }
}
