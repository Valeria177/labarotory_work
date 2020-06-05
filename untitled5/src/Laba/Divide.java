package Laba;

public class Divide implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;
    public Divide (AbstractNode left, AbstractNode right){
        this.left=left;
        this.right=right;
    }
    @Override
    public int calculate(){
        int temp = 0;
        if (left.calculate()!=0){
            temp=left.calculate()/right.calculate();
        }
        return temp;
    }
    @Override
    public String toString(){
        return "("+this.left.calculate()+"/"+this.right.calculate()+")";
    }

}
