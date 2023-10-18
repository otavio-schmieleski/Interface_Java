public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca bb = new Biblioteca();
        bb.getItens()[0] = new Livro("veloz", 2000, 100, 300);
        bb.getItens()[1] = new Livro("jornal", 2010, 2, 150);
        bb.getItens()[2] = new Livro("veloz", 2000, 100, 300);
        bb.getItens()[3] = new Livro("jornal", 2010, 2, 150);
        bb.getItens()[4] = new Livro("jornal", 2010, 2, 150);
        bb.getItens()[5] = new Livro("jornal", 2010, 2, 150);
        bb.getItens()[6] = new Livro("jornal", 2010, 2, 150);
        bb.getItens()[7] = new Livro("veloz", 2000, 100, 300);
        bb.getItens()[8] = new Livro("jornal", 2010, 2, 150);
        bb.getItens()[9] = new Livro("veloz", 2000, 100, 300);

        bb.getItens()[0] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[1] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[2] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[3] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[4] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[5] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[6] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[7] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[8] = new MidiaEletronica("gazeta", 2015, 5);
        bb.getItens()[9] = new MidiaEletronica("gazeta", 2015, 5);

        System.out.println(bb.calcularPrecoAluguel());
        bb.imprimirDetalhes();

    }
}
