public class Ex1 {
    public static void main(String[] args) {
        int number1=3;
        String name="Leticia"; 
        double taxes=0.16;
        boolean job=true;

        System.out.println(number1); //display on the terminal
        System.out.println(name);
        System.out.println(taxes);
        System.out.println(job);

        name="Luis";
        System.out.println(name);

        /**Arithmetic operator**/
        int num1=100;
        int num2=20;

        System.out.println("num1 + num2 = " +(num1+num2));
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);

        /**Assigment operators**/

        num1=10;
        num2=20;
        num1=num2;

        System.out.println("= Output "+num1);
        //num1=num1+num2;
        num1+=num2;
        System.out.println("+= Output "+num1);

        num1-=num2;
        System.out.println("-=Output "+num1);

        //increment, decrement
        num1++;
        System.err.println("num1++ Output " +num1);

        num2--;
        System.out.println("num2-- Output "+num2);
        
        /**Logical Operator**/
        boolean b1=true;
        boolean b2=false;

        System.out.println("b1 && b2 " + (b1&&b2)); //AND
        System.out.println("b1 || b2 " + (b1||b2)); //OR
        System.out.println("!b1 "+ !b1); //NOT

        //Create Program where you register a name, price and add taxes to a product.
        //variable: name, price, taxes
        //math operator *

        String product="Chocolate";
        double price=5.7;
        double tax=1.16;
        double result;

        result=price*tax;

        System.out.println(product);
        System.out.println("Price...... " + price + " dlls");
        System.out.println("Tax:....... " + tax);
        System.out.println("Total...... " + result + " dlls");

        /**
        The product is:
        Its price is:
        It has a tax of:
        Its total is:
        */
    }
}