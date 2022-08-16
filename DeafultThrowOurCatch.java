
package ExceptionHandling;

public class DeafultThrowOurCatch {
    public static void main(String[] args) {
        try{
            System.out.println("Result "+3/0);
            System.out.println("I'm in Try block");
        }
        catch(ArithmeticException e){
            System.out.println("Exception "+e.getMessage());
        }
        finally{
            System.out.println("I'm in Finally block");
        }
    }
}
