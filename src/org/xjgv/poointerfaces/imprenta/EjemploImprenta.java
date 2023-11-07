package org.xjgv.poointerfaces.imprenta;
import org.xjgv.poointerfaces.imprenta.modelo.*;
import org.xjgv.poointerfaces.imprenta.modelo.Genero.*;

import static org.xjgv.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("John Doe", "Ingeniero en sistemas", "Resumen laboral de John Doe");
        cv.addExperiencia("Java developer");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Desarrollador Angular");
        cv.addExperiencia("Springboot");

        Libro libro = new Libro("Erich Gamma", "Patrones de diseño",
                PROGRAMACION);

        libro.addPagina(new Pagina("PATRON SINGLETON"))
                .addPagina(new Pagina("Patron observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe("Estudio sobre microservicios", "Martin Fowler", "James");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
