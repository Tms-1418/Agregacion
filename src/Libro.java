public class Libro {
    private String titulo;
    private String autor;
    private Boolean disponible;

    public Libro(String titulo, String autor, Boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public Libro(){
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public Boolean isDisponible() {
        return disponible;
    }


    public void setTitulo(String titulo) {
        if(titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        }else{
            System.out.println("Error: el título no puede estar vacío");
        }
        
    }
    public void setAutor(String autor) {
        if(titulo != null && !titulo.isEmpty()){
            this.autor = autor;
        }else{
            System.out.println("Error: el autor no puede estar vacío");
        }
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    //Imprime los datos del libro en consola
    public void mostrarInfo(){
        System.out.println("----Libro----");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Si" : "No"));    
    }

    //Marcar libro como prestado
    public boolean prestar(){
        if (disponible){
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" fue prestado");
            return true;
        }else{
            System.out.println("El libro \"" + titulo + "\" ya está prestado");
            return false;
        }
    }

    //Marca el libro como devuelto
    public void devolver(){
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" fue devuelto");
    }
}
