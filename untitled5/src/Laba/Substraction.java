package Laba;

public class Substraction implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;
    public Substraction (AbstractNode left, AbstractNode right){
        this.left=left;
        this.right=right;
    }
    @Override public int calculate(){
        int temp = 0;
        if (left.calculate()!=0){
            temp=left.calculate()-right.calculate();
        }
        else{
            temp=right.calculate();
        }
        return temp;
    }
    @Override
    public String toString(){

        return "("+this.left.calculate()+"-"+this.right.calculate()+")";
    }
}
