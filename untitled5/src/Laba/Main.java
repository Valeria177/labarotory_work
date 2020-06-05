package Laba;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример:");
        AbstractNode operation1= new Substraction(new SimpleNode(5), new SimpleNode(3)),
                exp2=new Substraction(new SimpleNode(3), new SimpleNode(1));
        AbstractNode answer=new Divide(operation1, exp2);
        System.out.println("The second expression "+(operation1.toString())+"/"
                +(exp2.toString())+" is: "+answer.calculate());

    }

}
