package org.xjgv.poointerfaces.imprenta;

import org.xjgv.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("John Doe", "Ingeniero en sistemas", "Resumen laboral de John Doe");
        cv.addExperiencia("Java developer");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Desarrollador Angular");
        cv.addExperiencia("Springboot");

        Informe informe = new Informe("Estudio sobre microservicios", "Martin Fowler", "James");

        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
