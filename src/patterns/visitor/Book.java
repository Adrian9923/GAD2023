package patterns.visitor;

public class Book implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getPages() {
        return 200;
    }
}
