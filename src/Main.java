public class Main {
    public static void main(String[] args) {
        var curriculo = new Curriculo();
        var livro = new LivroEmPdf();
        var relatorio = new Relatorio();

        Impressora.imprimirDocumento(curriculo);
        Impressora.imprimirDocumento(livro);
        Impressora.imprimirDocumento(relatorio);
    }
}
