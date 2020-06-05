package laba7;

import java.util.Collection;

public class Denial implements AbstractNode{
    private final AbstractNode list;

    public Denial(AbstractNode list) {
        this.list = list;
    }

    @Override
    public boolean calculate() {
        return !(list.calculate());
    }

    @Override
    public String toString() {
        return "!(" + list + ")";
    }
}
