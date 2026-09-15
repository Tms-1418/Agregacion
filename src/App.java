public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El amor en tiempos de cólera", "Gabriel García Marquez");
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exúpery");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Luis Ángel Arango");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println();
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("Gabriel García Márquez");
        System.out.println();
        biblioteca.buscarPorAutor("Jorge Luis Borges");
    }
}
