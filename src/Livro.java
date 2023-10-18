public class Livro extends ItemBiblioteca implements Imprimivel {

    private int numPaginas;

    public Livro(String titulo, int anoPublicacao, int numCopias, int numPaginas) {
        super(titulo, anoPublicacao, numCopias);// preenche os parametros com os ja recebido no itembiblioteca
        this.numPaginas = numPaginas;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Titulo: " + getTitulo() + "\n" +
                "Ano de Publicacao: " + getAnoPublicacao() + "\n" +
                "Numero de Copias Disponives: " + getNumCopias() + "\n" +
                "Numero de Paginas: " + getNumPaginas() + "\n");
    }

    @Override
    public double calcularPrecoAluguel() {
        // TODO Auto-generated method stub
        double preco = 0.25 * getNumPaginas();
        return preco;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

}
