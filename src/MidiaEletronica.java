public class MidiaEletronica extends ItemBiblioteca implements Imprimivel {

    public MidiaEletronica(String titulo, int anoPublicacao, int numCopias) {
        super(titulo, anoPublicacao, numCopias);
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Titulo: " + getTitulo() + "\n" +
                "Ano de Publicacao: " + getAnoPublicacao() + "\n" +
                "Numero de Copias Disponives: " + getNumCopias() + "\n");
    }

    @Override
    public double calcularPrecoAluguel() {
        // TODO Auto-generated method stub
        return 12.5;
    }

}
