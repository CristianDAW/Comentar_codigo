/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradablogcmm;

/*Clase para manejar las entradas de un blog.
 * La clase se creó el (14-03-2021) por (Cristian).
 * Esta es la versión 2.3
 */
public class EntradaBlogCMM {

    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

    /**
     *
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
    public EntradaBlogCMM(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("El id no puede ser negativo");
        }
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    /**
     *
     * @return cadena de texto
     */
    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /**
     *
     * @return ID
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return Texto
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     *
     * @return Autor en mayúsculas
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }

    /**
     *
     * @return Autor
     */
    public String devuelveAutor() {
        return this.autor;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        EntradaBlogCMM e1 = new EntradaBlogCMM(3, " Cristian_Morcillo", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
