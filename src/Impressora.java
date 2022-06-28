public interface Impressora {
    static void imprimirDocumento(Documento documento) {
        documento.imprimir();
    }
}
