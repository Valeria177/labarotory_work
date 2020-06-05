package laba7;

import java.util.Collection;

public class Or implements AbstractNode{
    private final Collection<AbstractNode> list;

    public Or(Collection<AbstractNode> list) {
        this.list = list;
    }

    public boolean calculate() {
        AbstractNode first = list.iterator().next();
        boolean result = first.calculate();
        for (AbstractNode node : list){
            result  |= node.calculate();
        }
        return result;
    }

    public String toString() {
        String result = "";
        boolean first = true;

        for (AbstractNode node : list){
            if(!first)
                result += "|";
            first = false;
            result += "(" + node + ")";
        }
        return result;
    }

}
