package mediatheque;

public class CDVisitor implements ItemVisitor{

    public void visit(Book item) {
    }

    public void visit(CD item){
        System.out.println("Imprimer : " + item);
    }
}
