package org.xjgv.poointerfaces.imprenta;
import org.xjgv.poointerfaces.imprenta.modelo.*;
import org.xjgv.poointerfaces.imprenta.modelo.Genero.*;

import static org.xjgv.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("John", "Doe"), "Ingeniero en sistemas", "Resumen laboral de John Doe");
        cv.addExperiencia("Java developer")
            .addExperiencia("Oracle DBA")
            .addExperiencia("Desarrollador Angular")
            .addExperiencia("Springboot");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño",
                PROGRAMACION);

        libro.addPagina(new Pagina("PATRON SINGLETON"))
                .addPagina(new Pagina("Patron observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe("Estudio sobre microservicios", new Persona("Martin", "Fowler"), new Persona("James", "Sagan"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
