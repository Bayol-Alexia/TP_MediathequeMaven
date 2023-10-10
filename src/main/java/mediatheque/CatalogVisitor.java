package mediatheque;

public class CatalogVisitor implements ItemVisitor{

    public void visit(CD item) {
        System.out.println("Imprimer : " + item);
    }

    public void visit(Book item){
        System.out.println("Imprimer : " + item);
    }
}
