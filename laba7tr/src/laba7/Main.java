package laba7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AbstractNode first = new Or(Arrays.<AbstractNode>asList(
                new SimpleNode(true),
                new Denial(new SimpleNode(false)),
                new Denial(new SimpleNode(true))));

        AbstractNode second = new Denial(
                new Or(Arrays.<AbstractNode>asList(
                        new Denial(new SimpleNode(true)),
                        new Denial(new SimpleNode(false)))));

        System.out.println("The first expression: " + first + "\tAnswer= " + first.calculate());
        System.out.println("Second expression: " + second + "\tAnswer= " + second.calculate());
    }
}
