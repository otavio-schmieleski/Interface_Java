public class Biblioteca {
    private ItemBiblioteca itens[];

    public Biblioteca() {
        this.itens = new ItemBiblioteca[10];
    }

    public ItemBiblioteca[] getItens() {
        return itens;
    }

    public void imprimirDetalhes() {
        for (ItemBiblioteca item : itens) {
            item.imprimirDetalhes();
        }
    }

    public double calcularPrecoAluguel() {
        double preco = 0.0;
        for (ItemBiblioteca item : itens) {
            preco += item.calcularPrecoAluguel();
        }
        return preco;
    }

}
