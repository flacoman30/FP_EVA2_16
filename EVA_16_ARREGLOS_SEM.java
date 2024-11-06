/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_16_arreglos_sem;

/**
 *
 * @author flac3
 */
public class EVA_16_ARREGLOS_SEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[]diasSemana = {"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
         diasSemana[0] = "domingo";
        diasSemana[1] = "lunes";
        diasSemana[2] = "martes";
        diasSemana[3] = "miercoles";
        diasSemana[4] = "jueves";
        diasSemana[5] = "viernes";
        diasSemana[6] = "sabado";
        for( int i = 0; i < diasSemana.length;i++){
        System.out.println(diasSemana[i]);
    }
    }
}
